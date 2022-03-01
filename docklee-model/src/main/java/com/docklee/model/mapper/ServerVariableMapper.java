package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.ServerVariable;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ServerVariableMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ServerVariableMapper implements Serializable, Mapper<ServerVariable, com.docklee.model.pojo.ServerVariable> {

	private static final long serialVersionUID = 9081305476340438538L;

	@Override
	public com.docklee.model.pojo.ServerVariable map(ServerVariable input) throws MappingException {
		
		com.docklee.model.pojo.ServerVariable serverVariable = new com.docklee.model.pojo.ServerVariable();
		serverVariable.setAllowableValues(input.allowableValues());
		serverVariable.setDefaultValue(input.defaultValue());
		serverVariable.setDescription(input.description());
		serverVariable.setName(input.name());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			serverVariable.setExtensions(extensions);
		}
		return serverVariable;
	}

}
