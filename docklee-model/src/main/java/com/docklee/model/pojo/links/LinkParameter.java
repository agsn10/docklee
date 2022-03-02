package com.docklee.model.pojo.links;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>LinkParameter</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class LinkParameter implements Serializable {

	private String expression = "";
	private String name = "";
	
	public LinkParameter() {
		super();
	}

	public LinkParameter(String expression, String name) {
		super();
		this.expression = expression;
		this.name = name;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
