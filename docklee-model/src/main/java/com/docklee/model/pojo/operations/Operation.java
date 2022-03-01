package com.docklee.model.pojo.operations;

import java.io.Serializable;

import com.docklee.model.pojo.Parameter;
import com.docklee.model.pojo.parameters.RequestBody;
import com.docklee.model.pojo.responses.ApiResponse;
import com.docklee.model.pojo.security.SecurityRequirement;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Operation</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Operation implements Serializable{
	
	private static final long serialVersionUID = -6159239800911310796L;
	
	private String operationId;
	private String summary;
	private String[] tags;
	private SecurityRequirement[] securityRequirements;
	private String description;
	private ApiResponse[] responses = {};
	private RequestBody requestBody = new RequestBody();
	private Parameter[] parameters = {};
	private Server[] servers = {};
	
	
	public String getOperationId() {
		return operationId;
	}
	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	public SecurityRequirement[] getSecurityRequirements() {
		return securityRequirements;
	}
	public void setSecurityRequirements(SecurityRequirement[] securityRequirements) {
		this.securityRequirements = securityRequirements;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ApiResponse[] getResponses() {
		return responses;
	}
	public void setResponses(ApiResponse[] responses) {
		this.responses = responses;
	}
	public RequestBody getRequestBody() {
		return requestBody;
	}
	public void setRequestBody(RequestBody requestBody) {
		this.requestBody = requestBody;
	}
	public Parameter[] getParameters() {
		return parameters;
	}
	public void setParameters(Parameter[] parameters) {
		this.parameters = parameters;
	}
	public Server[] getServers() {
		return servers;
	}
	public void setServers(Server[] servers) {
		this.servers = servers;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
