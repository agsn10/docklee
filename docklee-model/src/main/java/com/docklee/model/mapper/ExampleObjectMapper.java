package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.media.ExampleObject;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExampleObjectMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExampleObjectMapper implements Serializable, Mapper<ExampleObject, com.docklee.model.pojo.media.ExampleObject> {

	private static final long serialVersionUID = -350013613652883482L;

	@Override
	public com.docklee.model.pojo.media.ExampleObject map(ExampleObject input) throws MappingException {
		
		com.docklee.model.pojo.media.ExampleObject exampleObject = new com.docklee.model.pojo.media.ExampleObject();
		exampleObject.setExternalValue(input.externalValue());
		exampleObject.setName(input.name());
		exampleObject.setRef(input.ref());
		exampleObject.setSummary(input.summary());
		exampleObject.setValue(input.value());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			exampleObject.setExtensions(extensions);
		}
		return exampleObject;
	}

}
