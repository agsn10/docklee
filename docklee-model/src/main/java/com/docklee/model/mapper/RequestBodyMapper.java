package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.parameters.RequestBody;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.Content;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>RequestBodyMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class RequestBodyMapper implements Serializable, Mapper<RequestBody, com.docklee.model.pojo.parameters.RequestBody> {

	private static final long serialVersionUID = -4054881561591954504L;

	@Override
	public com.docklee.model.pojo.parameters.RequestBody map(RequestBody input) throws MappingException {
		com.docklee.model.pojo.parameters.RequestBody requestBody = new com.docklee.model.pojo.parameters.RequestBody();
		requestBody.setDescription(input.description());
		requestBody.setRef(input.ref());
		requestBody.setRequired(input.required());
		if(ArrayUtils.isNotEmpty(input.content())){
			Content[] contents = new Content[input.content().length];
			for(int i=0; i<input.content().length; i++)
				contents[i] = new ContentMapper().map(input.content()[i]);
			requestBody.setContent(contents);
		}
		if(ArrayUtils.isNotEmpty(input.extensions())){
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			requestBody.setExtensions(extensions);
		}
		
		return requestBody;
	}

}
