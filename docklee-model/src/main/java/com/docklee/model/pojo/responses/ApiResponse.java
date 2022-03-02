package com.docklee.model.pojo.responses;

import java.io.Serializable;

import com.docklee.model.pojo.headers.Header;
import com.docklee.model.pojo.links.Link;
import com.docklee.model.pojo.media.Content;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ApiResponse</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
public class ApiResponse implements Serializable{

	private String responseCode;
	private String description;
	private Content[] content = {};
	private String ref;
	private Header[] headers = {};
	private Link[] links = {};
	
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Content[] getContent() {
		return content;
	}
	public void setContent(Content[] content) {
		this.content = content;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public Header[] getHeaders() {
		return headers;
	}
	public void setHeaders(Header[] headers) {
		this.headers = headers;
	}
	public Link[] getLinks() {
		return links;
	}
	public void setLinks(Link[] links) {
		this.links = links;
	}
	
	
	
}
