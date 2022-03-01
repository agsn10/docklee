package com.docklee.model.mapper;

import java.io.Serializable;

import org.apache.commons.lang3.ArrayUtils;

import com.docklee.annotation.responses.ApiResponse;
import com.docklee.model.exception.MappingException;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ApiResponseMapper</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ApiResponseMapper implements Serializable, Mapper<ApiResponse, com.docklee.model.pojo.responses.ApiResponse> {

	private static final long serialVersionUID = 4778170013346583335L;

	/**
	 *
	 * */
	@Override
	public com.docklee.model.pojo.responses.ApiResponse map(ApiResponse input) throws MappingException {

		com.docklee.model.pojo.responses.ApiResponse apiResponse = new com.docklee.model.pojo.responses.ApiResponse();
		apiResponse.setDescription(input.description());
		apiResponse.setRef(input.ref());
		apiResponse.setResponseCode(input.responseCode());
		if(ArrayUtils.isNotEmpty(input.content())) {
			com.docklee.model.pojo.media.Content[] contents = new com.docklee.model.pojo.media.Content[input.content().length];
			for(int i=0; i<input.content().length; i++)
				contents[i] = new ContentMapper().map(input.content()[i]);
			apiResponse.setContent(contents);
		}
		if(ArrayUtils.isNotEmpty(input.headers())) {
			com.docklee.model.pojo.headers.Header[] headers = new com.docklee.model.pojo.headers.Header[input.headers().length];
			for(int i=0; i<input.headers().length; i++)
				headers[i] = new HeaderMapper().map(input.headers()[i]);
			apiResponse.setHeaders(headers);
		}
		if(ArrayUtils.isNotEmpty(input.links())) {
			com.docklee.model.pojo.links.Link[] links = new com.docklee.model.pojo.links.Link[input.links().length];
			for(int i=0; i<input.links().length; i++)
				links[i] = new LinkMapper().map(input.links()[i]);
			apiResponse.setLinks(links);
		}
		
		return apiResponse;
	}

}
