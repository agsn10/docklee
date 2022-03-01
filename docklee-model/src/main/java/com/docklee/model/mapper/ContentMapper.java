package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.Content;
import com.docklee.model.pojo.media.Encoding;
import com.docklee.model.pojo.media.ExampleObject;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ContentMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 10-11-2020 
 */
public class ContentMapper implements Serializable, Mapper<com.docklee.annotation.media.Content, Content> {

	private static final long serialVersionUID = -2479457485153889230L;

	@Override
	public Content map(com.docklee.annotation.media.Content input) throws MappingException {
		
		Content content = new Content();
		content.setMediaType(input.mediaType());
		content.setSchema(new SchemaMapper().map(input.schema()));
		content.setArray(new ArraySchemaMapper().map(input.array()));
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			content.setExtensions(extensions);
		}
		if(ArrayUtils.isNotEmpty(input.encoding())) {
			Encoding[] encodings = new Encoding[input.encoding().length];
			for(int i=0; i<input.encoding().length; i++)
				encodings[i] = new EncodingMapper().map(input.encoding()[i]);
			content.setEncoding(encodings);
		}
		if(ArrayUtils.isNotEmpty(input.examples())) {
			ExampleObject[] exampleObjects = new ExampleObject[input.examples().length];
			for(int i=0; i<input.examples().length; i++)
				exampleObjects[i] = new ExampleObjectMapper().map(input.examples()[i]);
			content.setExamples(exampleObjects);
		}
		
		return content;
	}

}
