package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.operations.Server;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.ServerVariable;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ServerMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ServerMapper implements Serializable, Mapper<Server, com.docklee.model.pojo.operations.Server>{

	private static final long serialVersionUID = -7254204107625856417L;

	@Override
	public com.docklee.model.pojo.operations.Server map(Server input) throws MappingException {
		
		com.docklee.model.pojo.operations.Server server = new com.docklee.model.pojo.operations.Server();
		server.setDescription(input.description());
		server.setUrl(input.url());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			server.setExtensions(extensions);
		}
		if(ArrayUtils.isNotEmpty(input.variables())) {
			ServerVariable[] serverVariables = new ServerVariable[input.variables().length];
			for(int i=0; i<input.variables().length; i++)
				serverVariables[i] = new ServerVariableMapper().map(input.variables()[i]);
			server.setVariables(serverVariables);
		}
		return server;
	}

}
