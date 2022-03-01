package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExternalDocumentation</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExternalDocumentation implements Serializable{

	private String description = "";
	private Extension[] extensions = {};
	private String url = "";
	
	public ExternalDocumentation() {
		super();
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
}
