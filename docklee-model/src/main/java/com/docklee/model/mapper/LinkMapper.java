package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.links.Link;
import com.docklee.model.exception.MappingException;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.links.LinkParameter;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>LinkMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class LinkMapper implements Serializable, Mapper<Link, com.docklee.model.pojo.links.Link> {

	private static final long serialVersionUID = -6681073443843474758L;

	@Override
	public com.docklee.model.pojo.links.Link map(Link input) throws MappingException {
		com.docklee.model.pojo.links.Link link = new com.docklee.model.pojo.links.Link();
		link.setDescription(input.description());
		link.setName(input.name());
		link.setOperationId(input.operationId());
		link.setOperationRef(input.operationRef());
		link.setRef(input.ref());
		link.setRequestBody(input.requestBody());
		if(ArrayUtils.isNotEmpty(input.extensions())) {
			Extension[] extensions = new Extension[input.extensions().length];
			for(int i=0; i<input.extensions().length; i++)
				extensions[i] = new ExtensionMapper().map(input.extensions()[i]);
			link.setExtensions(extensions);
		}
		if(ArrayUtils.isNotEmpty(input.parameters())) {
			LinkParameter[] linkParameters = new LinkParameter[input.parameters().length];
			for(int i=0; i<input.parameters().length; i++)
				linkParameters[i] = new LinkParameterMapper().map(input.parameters()[i]);
			link.setParameters(linkParameters);
		}
		link.setServer(new ServerMapper().map(input.server()));
		return link;
	}

}
