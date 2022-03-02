package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ServerVariable</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ServerVariable implements Serializable {

	private String defaultValue;
	private String name;
	private String[] allowableValues = {};
	private String description = "";
	private Extension[] extensions = {};
	
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getAllowableValues() {
		return allowableValues;
	}
	public void setAllowableValues(String[] allowableValues) {
		this.allowableValues = allowableValues;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Extension[] getExtensions() {
		return extensions;
	}
	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}
	
	
	
}
