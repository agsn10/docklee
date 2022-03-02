package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.ExternalDocumentation;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ExternalDocumentationMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ExternalDocumentationMapper implements Serializable, Mapper<ExternalDocumentation, com.docklee.model.pojo.ExternalDocumentation> {

	@Override
	public com.docklee.model.pojo.ExternalDocumentation map(ExternalDocumentation input) throws MappingException {
		
		com.docklee.model.pojo.ExternalDocumentation externalDocumentation = new com.docklee.model.pojo.ExternalDocumentation();
		externalDocumentation.setDescription(input.description());
		externalDocumentation.setUrl(input.url());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			externalDocumentation.setExtensions(extensions);
		}		
		return externalDocumentation;
	}

}
