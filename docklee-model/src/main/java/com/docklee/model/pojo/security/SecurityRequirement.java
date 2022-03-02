package com.docklee.model.pojo.security;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>SecurityRequirement</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class SecurityRequirement implements Serializable{

	private String name = "";
	private String[] scopes = {};
	
	public SecurityRequirement() {
		super();
	}

	public SecurityRequirement(String name, String[] scopes) {
		super();
		this.name = name;
		this.scopes = scopes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getScopes() {
		return scopes;
	}

	public void setScopes(String[] scopes) {
		this.scopes = scopes;
	}
	
	
	
}
