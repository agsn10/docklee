package com.docklee.model.mapper;

import java.io.Serializable;

import com.docklee.annotation.extensions.ExtensionProperty;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExtensionPropertyMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExtensionPropertyMapper implements Serializable, Mapper<ExtensionProperty, com.docklee.model.pojo.extensions.ExtensionProperty>{

	@Override
	public com.docklee.model.pojo.extensions.ExtensionProperty map(ExtensionProperty input)	throws MappingException {
		com.docklee.model.pojo.extensions.ExtensionProperty extensionProperty = new com.docklee.model.pojo.extensions.ExtensionProperty();
		extensionProperty.setName(input.name());
		extensionProperty.setValue(input.value());
		return extensionProperty;
	}

}
