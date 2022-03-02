package com.docklee.core.action;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ActionParameters</code> server to group the parameter names of the requests.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
public enum ActionParameters {

	/**
	 * Refers to the parameter used on log in page.
	 */
	USERNAME("username"),
	/**
	 * Refers to the parameter used on log in page.
	 */
	PASSWORD("password"),
	/**
	 * Refers to the parameter used in all requests of actions.
	 */
	ACTION("action");
	
	private String name;

	/**
	 * <p>
	 * Constructor
	 * </p>
	 * 
	 * @param name The name parameter.
	 */
	ActionParameters(String name) {
		this.name = name;
	}
	
	/**
	 * <p>
	 * The method <code>getName</code> return tha name of parameter.
	 * </p>
	 * 
	 * @return The name parameter.
	 */
	public String getName() {
		return this.name();
	}
}
