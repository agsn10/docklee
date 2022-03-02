package com.docklee.model.pojo.extensions;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Extension</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Extension implements Serializable{

	private ExtensionProperty[] properties = {};
	private String name = "";
	
	public Extension() {
		super();
	}

	public Extension(ExtensionProperty[] properties, String name) {
		super();
		this.properties = properties;
		this.name = name;
	}

	public ExtensionProperty[] getProperties() {
		return properties;
	}

	public void setProperties(ExtensionProperty[] properties) {
		this.properties = properties;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
