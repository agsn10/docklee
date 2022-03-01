package com.docklee.model.pojo.parameters;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.Content;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>RequestBody</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class RequestBody implements Serializable{

	private Content[] content = {};
	private String description = "";
	private Extension[] extensions = {};
	private String ref = "";
	private boolean required = false;
	
	public RequestBody() {
		super();
	}
	
	public RequestBody(Content[] content, String description, Extension[] extensions, String ref, boolean required) {
		super();
		this.content = content;
		this.description = description;
		this.extensions = extensions;
		this.ref = ref;
		this.required = required;
	}

	public Content[] getContent() {
		return content;
	}

	public void setContent(Content[] content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Extension[] getExtensions() {
		return extensions;
	}

	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}
	
	
}
