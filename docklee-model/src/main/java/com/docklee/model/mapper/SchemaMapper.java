package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.media.Schema;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.DiscriminatorMapping;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>SchemaMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class SchemaMapper implements Serializable, Mapper<Schema, com.docklee.model.pojo.media.Schema> {

	private static final long serialVersionUID = 1L;

	@Override
	public com.docklee.model.pojo.media.Schema map(Schema input) throws MappingException {
		
		com.docklee.model.pojo.media.Schema schema = new com.docklee.model.pojo.media.Schema();
		try {
			schema.setAccessMode(input.accessMode());		
			if(ArrayUtils.isNotEmpty(input.allOf())) 							
				schema.setAllOf(input.allOf());														
			if(ArrayUtils.isNotEmpty(input.allowableValues())) 
				schema.setAllowableValues(input.allowableValues());
			if(ArrayUtils.isNotEmpty(input.anyOf())) 
				schema.setAnyOf(input.anyOf());
			schema.setDefaultValue(input.defaultValue());
			schema.setDeprecated(input.deprecated());
			schema.setDescription(input.description());
			if(ArrayUtils.isNotEmpty(input.discriminatorMapping())) {
				DiscriminatorMapping[] dms = new DiscriminatorMapping[input.discriminatorMapping().length];
				for(int i=0; i<input.discriminatorMapping().length; i++)
					dms[i] = new DiscriminatorMappingMapper().map(input.discriminatorMapping()[i]);			
				schema.setDiscriminatorMapping(dms);
			}
			schema.setDiscriminatorProperty(input.discriminatorProperty());
			schema.setExample(input.example());
			schema.setExclusiveMaximum(input.exclusiveMaximum());
			schema.setExclusiveMinimum(input.exclusiveMinimum());
			
			if(ArrayUtils.isNotEmpty(input.extensions())) {
				Extension[] extensions = new Extension[input.extensions().length];
				for(int i=0; i<input.extensions().length; i++)
					extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
				schema.setExtensions(extensions);
			}
			
			schema.setExternalDocs(new ExternalDocumentationMapper().map(input.externalDocs()));
			schema.setFormat(input.format());
			schema.setHidden(input.hidden());
			schema.setImplementation(input.implementation());
			schema.setMaximum(input.maximum());
			schema.setMaxLength(input.maxLength());
			schema.setMaxProperties(input.maxProperties());
			schema.setMinimum(input.minimum());
			schema.setMinLength(input.minLength());
			schema.setMinProperties(input.minProperties());
			schema.setMultipleOf(input.multipleOf());
			schema.setName(input.name());
			schema.setNot(input.not());
			schema.setNullable(input.nullable());			
			if(ArrayUtils.isNotEmpty(input.oneOf())) 
				schema.setOneOf(input.oneOf());			
			schema.setPattern(input.pattern());
			schema.setRef(input.ref());
			schema.setRequired(input.required());						
			if(ArrayUtils.isNotEmpty(input.requiredProperties()))
				schema.setRequiredProperties(input.requiredProperties());					
			if(ArrayUtils.isNotEmpty(input.subTypes()))
				schema.setSubTypes(input.subTypes());		
			schema.setTitle(input.title());
			schema.setType(input.type());
			
		}catch (Exception e) {
			throw new MappingException();
		}
		
		return schema;
	}

}
