package com.docklee.model.pojo.media;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.headers.Header;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Encoding</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Encoding implements Serializable{

	private boolean allowReserved = false;
	private String contentType = "";
	private boolean explode = false;
	private Extension[] extensions = {};
	private Header[] headers = {};
	private String name = "";
	private String style = "";
	
	public boolean isAllowReserved() {
		return allowReserved;
	}
	public void setAllowReserved(boolean allowReserved) {
		this.allowReserved = allowReserved;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public boolean isExplode() {
		return explode;
	}
	public void setExplode(boolean explode) {
		this.explode = explode;
	}
	public Extension[] getExtensions() {
		return extensions;
	}
	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}
	public Header[] getHeaders() {
		return headers;
	}
	public void setHeaders(Header[] headers) {
		this.headers = headers;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
