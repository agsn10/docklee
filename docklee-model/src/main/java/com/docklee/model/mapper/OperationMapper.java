package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.operations.Operation;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.parameters.Parameter;
import com.docklee.model.pojo.operations.Server;
import com.docklee.model.pojo.responses.ApiResponse;
import com.docklee.model.pojo.security.SecurityRequirement;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>OperationMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class OperationMapper implements Serializable, Mapper<Operation, com.docklee.model.pojo.operations.Operation> {

	private static final long serialVersionUID = -2876728525075937850L;

	@Override
	public com.docklee.model.pojo.operations.Operation map(Operation input) throws MappingException {
		
		com.docklee.model.pojo.operations.Operation operation = new com.docklee.model.pojo.operations.Operation();
		operation.setDescription(input.description());
		operation.setOperationId(input.operationId());
		if(ArrayUtils.isNotEmpty(input.parameters())) {
			Parameter[] parameters = new Parameter[input.parameters().length];
			for(int i=0; i<input.parameters().length; i++)
				parameters[i] = new ParameterMapper().map(input.parameters()[i]);
			operation.setParameters(parameters);
		}
		operation.setSummary(input.summary());
		operation.setTags(input.tags());
		operation.setRequestBody(new RequestBodyMapper().map(input.requestBody()));
		if(ArrayUtils.isNotEmpty(input.responses())) {
			ApiResponse[] apiResponses = new ApiResponse[input.responses().length];
			for(int i=0; i<input.responses().length; i++)
				apiResponses[i] = new ApiResponseMapper().map(input.responses()[i]);
			operation.setResponses(apiResponses);
		}
		if(ArrayUtils.isNotEmpty(input.servers())) {
			Server[] servers = new Server[input.servers().length];
			for(int i=0; i<input.servers().length; i++)
				servers[i] = new ServerMapper().map(input.servers()[i]);
			operation.setServers(servers);
		}		
		if(ArrayUtils.isNotEmpty(input.security())) {
			SecurityRequirement[] securityRequirements = new SecurityRequirement[input.security().length];
			for(int i=0; i<input.security().length; i++)
				securityRequirements[i] = new SecurityRequirementMapper().map(input.security()[i]);
			operation.setSecurityRequirements(securityRequirements);
		}
				
		return operation;
	}

	
}
