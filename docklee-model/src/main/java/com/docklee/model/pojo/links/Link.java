package com.docklee.model.pojo.links;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.operations.Server;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Link</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Link implements Serializable{


	private String description = "";
	private Extension[] extensions = {};
	private String name = "";
	private String operationId ="";
	private String operationRef = "";
	private LinkParameter[] parameters = {};
	private String ref = "";
	private String requestBody = "";
	private Server server = new Server();
	

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOperationId() {
		return operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public String getOperationRef() {
		return operationRef;
	}

	public void setOperationRef(String operationRef) {
		this.operationRef = operationRef;
	}

	public LinkParameter[] getParameters() {
		return parameters;
	}

	public void setParameters(LinkParameter[] parameters) {
		this.parameters = parameters;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getRequestBody() {
		return requestBody;
	}

	public void setRequestBody(String requestBody) {
		this.requestBody = requestBody;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}

	
}
