package com.docklee.model.mapper;

import java.io.Serializable;

import com.docklee.annotation.security.SecurityRequirement;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>SecurityRequirementMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class SecurityRequirementMapper implements Serializable, Mapper<SecurityRequirement, com.docklee.model.pojo.security.SecurityRequirement> {

	private static final long serialVersionUID = 6540761040926802864L;

	@Override
	public com.docklee.model.pojo.security.SecurityRequirement map(SecurityRequirement input) throws MappingException {
	    com.docklee.model.pojo.security.SecurityRequirement securityRequirement = new com.docklee.model.pojo.security.SecurityRequirement();
		securityRequirement.setName(input.name());
		securityRequirement.setScopes(input.scopes());
		return securityRequirement;
	}

}
