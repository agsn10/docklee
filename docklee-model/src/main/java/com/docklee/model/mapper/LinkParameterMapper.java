package com.docklee.model.mapper;

import java.io.Serializable;

import com.docklee.annotation.links.LinkParameter;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>LinkParameterMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class LinkParameterMapper implements Serializable, Mapper<LinkParameter, com.docklee.model.pojo.links.LinkParameter> {

	private static final long serialVersionUID = 3882591136368504328L;

	@Override
	public com.docklee.model.pojo.links.LinkParameter map(LinkParameter input) throws MappingException {
		com.docklee.model.pojo.links.LinkParameter linkParameter = new com.docklee.model.pojo.links.LinkParameter();
		linkParameter.setExpression(input.expression());
		linkParameter.setName(input.name());
		return linkParameter;
	}

}
