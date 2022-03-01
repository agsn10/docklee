package com.docklee.core.action;

import java.io.Serializable;

import com.docklee.core.action.impl.DoLoginAction;
import com.docklee.core.action.impl.DoRedirectLoginAction;
import com.docklee.core.action.impl.ShowLoginAction;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ActionConfig</code> ....
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 */
public enum ActionConfig implements Serializable{

	/**
	 *  Refers to the action used to redirect after log in.
	 */
	DO_REDIRECT_LOGIN_ACTION("doRedirectLoginAction", new DoRedirectLoginAction()),
	/**
	 *  Refers to the action used to show the log in page.
	 */
	SHOW_LOGIN_ACTION("showLoginAction", new ShowLoginAction()),
	/**
	 *  Refers to the action used to do log in the user on console.
	 */
	DO_LOGIN_ACTION("doLoginAction", new DoLoginAction());
	
	private String actionName;
	private Action action;
	
	/**
	 * <p>
	 * Constructor
	 * </p>
	 * 
	 * @param actionName The name of action.
	 * @param action Implementation of action.
	 */
	ActionConfig(String actionName, Action action) {
		this.actionName = actionName;
		this.action = action;
	}

	/**
	 * <p>
	 * The method <code>getActionName</code> return tha name of action.
	 * </p>
	 * 
	 * @return The name action.
	 */
	public String getActionName() {
		return actionName;
	}

	/**
	 * <p>
	 * The method <code>getAction</code> return a implementation of action.
	 * </p>
	 * 
	 * @return The implementation of action.
	 */
	public Action getAction() {
		return action;
	}
	
}