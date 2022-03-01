package com.docklee.core.action;

import java.io.IOException;
import java.io.Serializable;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;
import com.docklee.core.exception.ActionException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ActionOrchestrator</code> orchestrates all actions in the context of Docklee.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public final class ActionOrchestrator extends HashMap<String, Action> implements Serializable{

	private static final long serialVersionUID = -5755095806404856658L;
	
	private transient HttpServletRequest request;
	private transient HttpServletResponse response;
	private EnumSet<ActionConfig> actions = EnumSet.of(ActionConfig.SHOW_LOGIN_ACTION, 
			                                           ActionConfig.DO_LOGIN_ACTION, 
			                                           ActionConfig.DO_REDIRECT_LOGIN_ACTION);
	
	
	private ActionOrchestrator() {
	}
		
	/**
	 * <p>
	 * The method <code>inicializeActions</code> loads the actions in the orchestrator.
	 * </p>
	 */
	public void inicializeActions() {
		actions.stream().forEach( act -> this.put(act.getActionName(), act.getAction()) );		
	}
	
	/**
	 * <p>
	 * The method <code>getAction</code> return the name of action from request.
	 * </p>
	 * 
	 *
	 * @param request Interface HttpServletRequest.
	 * @param response Interface HttpServletResponse.
     * @return Action name sent via request.
	 */
	public String getAction(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		return request.getParameter(ActionParameters.ACTION.name());
	}
	
	/**
	 * <p>
	 * The method <code>action</code> return an implementation of the action.
	 * </p>
	 * 
	 * @param actionConfig Reference to the action to be taken in the context of the orchestrator.
	 * @return An implementation of the action.
	 */
	private Action action(ActionConfig actionConfig) {
		return this.get(actionConfig.getActionName());
	}
	
	/**
	 * <p>
	 * The method <code>executeAction</code> perform an action.
	 * </p>
	 * 
	 * @param actionName The name of action.
	 */
	public void executeAction(String actionName){
				
	   Action action = this.get(actionName);
	   try {
		    Map<String, Object> globalDataMap = ContextManager.getInstance().loadContext(request.getServletContext()).getContext(ContextInfo.Ctx.GLOBAL_DATA);
		    boolean redirectToLogin = Objects.nonNull(globalDataMap.get(ContextInfo.GlobalData.LOGIN_USERNAME)) && 
		    		                  Objects.nonNull(globalDataMap.get(ContextInfo.GlobalData.LOGIN_PASSWORD));

			if(false) //redirectToLogin && Objects.isNull(action)
				action(ActionConfig.SHOW_LOGIN_ACTION).execute(request, response);
			else if(!Optional.ofNullable(actionName).isPresent()) 
				action(ActionConfig.DO_REDIRECT_LOGIN_ACTION).execute(request, response);
			else if(Optional.ofNullable(action).isPresent()) 
				action.execute(request, response);
			else
				response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Action not found: "+actionName);

		} catch (ActionException | IOException e1) {
			try {response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, e1.getMessage());	} 
			catch (IOException e) {System.err.println(e);}
		}
	}

	/**
	 * <p>
	 * The method <code>aNewActionOrchestrator</code> create an instance of ActionOrchestrator.
	 * </p>
	 *
	 * @return New instance
	 */

	/**
	 * <p>
	 * The method <code>aNewActionOrchestrator</code> create an instance of ActionOrchestrator.
	 * </p>
	 * 
	 * @return New instance
	 */
	public static ActionOrchestrator aNewActionOrchestrator() {
		return new ActionOrchestrator();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((actions == null) ? 0 : actions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ActionOrchestrator other = (ActionOrchestrator) obj;
		if (actions == null) {
			if (other.actions != null)
				return false;
		} else if (!actions.equals(other.actions))
			return false;
		return true;
	}
}
