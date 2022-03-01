package com.docklee.model.mapper;

import java.io.Serializable;

import com.docklee.annotation.headers.Header;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>HeaderMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class HeaderMapper implements Serializable, Mapper<Header, com.docklee.model.pojo.headers.Header> {

	@Override
	public com.docklee.model.pojo.headers.Header map(Header input) throws MappingException {
		
		com.docklee.model.pojo.headers.Header header = new com.docklee.model.pojo.headers.Header();
		header.setDeprecated(input.deprecated());
		header.setDescription(input.description());
		header.setName(input.name());
		header.setRef(input.ref());
		header.setRequired(input.required());
		header.setSchema(new SchemaMapper().map(input.schema()));
		return header;
	}

}
