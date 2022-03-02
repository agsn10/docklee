package com.docklee.model.pojo.operations;

import java.io.Serializable;

import com.docklee.model.pojo.ServerVariable;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Server</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Server implements Serializable {

	private String description = "";
	private Extension[] extensions = {};
	private String url = "";
	private ServerVariable[] variables = {};
	
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

	public ServerVariable[] getVariables() {
		return variables;
	}

	public void setVariables(ServerVariable[] variables) {
		this.variables = variables;
	}

	
	
}
