package com.docklee.model.pojo.extensions;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExtensionProperty</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExtensionProperty implements Serializable{

	private String name;
	private String value;
	
	public ExtensionProperty() {
		super();
	}

	public ExtensionProperty(String name, String value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
