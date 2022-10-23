package com.docklee.core.action.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.docklee.core.ContextInfo;
import com.docklee.core.ContextManager;
import com.docklee.core.action.Action;
import com.docklee.core.action.ActionParameters;
import com.docklee.core.exception.ActionException;



/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>DoLoginAction</code> represents the log in action.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public class DoLoginAction implements Action {

	
	/**
	 * <p>
	 * The method <code>execute</code> when invoked executes the action.
	 * </p>
	 * 
	 * @param request The interface HttpServletRequest from container.
	 * @param response The interface HttpServletResponse from container.
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ActionException {
		
		String username = request.getParameter(ActionParameters.USERNAME.name());
		String password = request.getParameter(ActionParameters.PASSWORD.name());
		ContextManager contextManager = ContextManager.getInstance().loadContext(request.getServletContext());
		String usr = contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).get(ContextInfo.GlobalData.LOGIN_USERNAME).toString();
		String pwd = contextManager.getContext(ContextInfo.Ctx.GLOBAL_DATA).get(ContextInfo.GlobalData.LOGIN_PASSWORD).toString();
		//MessageDto message = null;
/*		try {
			if(Objects.nonNull(username) && Objects.nonNull(password)) {
				if(usr.equals(username) && pwd.equals(password)) { */
					//message = MessageDto.Builder.create().setStatus(MessageDto.Status.SUCCESS.name()).build();
		try {
			response.getWriter().write("Hello World");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
