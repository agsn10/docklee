package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.extensions.Extension;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.ExtensionProperty;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExtensionMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExtensionMapper implements Serializable, Mapper<Extension, com.docklee.model.pojo.extensions.Extension> {

	@Override
	public com.docklee.model.pojo.extensions.Extension map(Extension input) throws MappingException {
		com.docklee.model.pojo.extensions.Extension extension = new com.docklee.model.pojo.extensions.Extension();
		extension.setName(input.name());
		if(ArrayUtils.isNotEmpty(input.properties())) {
			ExtensionProperty[] extensionProperties = new ExtensionProperty[input.properties().length];
			for(int i=0; i<input.properties().length; i++) 
				extensionProperties[i] = new ExtensionPropertyMapper().map(input.properties()[i]);
			extension.setProperties(extensionProperties);
		}
		return extension;
	}

}
