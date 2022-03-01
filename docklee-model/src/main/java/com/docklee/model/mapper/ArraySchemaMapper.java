package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.media.ArraySchema;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ArraySchemaMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ArraySchemaMapper implements Serializable, Mapper<ArraySchema, com.docklee.model.pojo.media.ArraySchema> {

	private static final long serialVersionUID = -6494155906810366645L;

	@Override
	public com.docklee.model.pojo.media.ArraySchema map(ArraySchema input) throws MappingException {
		
		com.docklee.model.pojo.media.ArraySchema arraySchema = new com.docklee.model.pojo.media.ArraySchema();
		arraySchema.setMaxItems(input.maxItems());
		arraySchema.setMinItems(input.minItems());
		arraySchema.setUniqueItems(input.uniqueItems());
		arraySchema.setSchema(new SchemaMapper().map(input.schema()));	
		arraySchema.setArraySchema(new SchemaMapper().map(input.arraySchema()));
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			arraySchema.setExtensions(extensions);
		}		
		return arraySchema;
	}

}
