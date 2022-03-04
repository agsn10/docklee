package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.parameters.Parameter;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.Content;
import com.docklee.model.pojo.media.ExampleObject;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ParameterMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ParameterMapper implements Serializable, Mapper<Parameter, com.docklee.model.pojo.parameters.Parameter> {

	private static final long serialVersionUID = -6381888763588515460L;

	@Override
	public com.docklee.model.pojo.parameters.Parameter map(Parameter input) throws MappingException {
		
		com.docklee.model.pojo.parameters.Parameter parameter = new com.docklee.model.pojo.parameters.Parameter();
		
		parameter.setAllowEmptyValue(input.allowEmptyValue());
		parameter.setAllowReserved(input.allowReserved());
		parameter.setArray(new ArraySchemaMapper().map(input.array()));
		if(ArrayUtils.isNotEmpty(input.content())) {
			Content[] contents = new Content[input.content().length];
			for(int i=0; i<input.content().length; i++)
				contents[i] = new ContentMapper().map(input.content()[i]);
			parameter.setContent(contents);
		}
		parameter.setDeprecated(input.deprecated());
		parameter.setDescription(input.description());
		parameter.setExample(input.example());
		if(ArrayUtils.isNotEmpty(input.examples())) {
			ExampleObject[] examples = new ExampleObject[input.examples().length];
			for(int i=0; i<examples.length; i++)
				examples[i] = new ExampleObjectMapper().map(input.examples()[i]);
			parameter.setExamples(examples);
		}
		parameter.setExplode(input.explode());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			parameter.setExtensions(extensions);
		}
		parameter.setHidden(input.hidden());
		parameter.setIn(input.in());
		parameter.setName(input.name());
		parameter.setRef(input.ref());
		parameter.setRequired(input.required());
		parameter.setSchema(new SchemaMapper().map(input.schema()));
		parameter.setStyle(input.style());

		return parameter;
	}

}
