package com.docklee.model.mapper;

import java.io.Serializable;

import com.docklee.annotation.media.DiscriminatorMapping;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>DiscriminatorMappingMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class DiscriminatorMappingMapper implements Serializable, Mapper<DiscriminatorMapping, com.docklee.model.pojo.media.DiscriminatorMapping> {

	private static final long serialVersionUID = 1L;

	@Override
	public com.docklee.model.pojo.media.DiscriminatorMapping map(DiscriminatorMapping input) throws MappingException {
		
		com.docklee.model.pojo.media.DiscriminatorMapping discriminatorMapping = new com.docklee.model.pojo.media.DiscriminatorMapping();
		discriminatorMapping.setValue(input.value());
		discriminatorMapping.setSchema(input.schema());
		return discriminatorMapping;
	}

}
