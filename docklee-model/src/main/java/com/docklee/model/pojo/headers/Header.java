package com.docklee.model.pojo.headers;

import java.io.Serializable;

import com.docklee.model.pojo.media.Schema;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Header</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Header implements Serializable{

	private String name;
	private boolean deprecated = false;
	private String description = "";
	private String ref = "";
	private boolean required = false;
	private Schema schema = new Schema();
	
	public Header() {
		super();
	}

	public Header(String name, boolean deprecated, String description, String ref, boolean required, Schema schema) {
		super();
		this.name = name;
		this.deprecated = deprecated;
		this.description = description;
		this.ref = ref;
		this.required = required;
		this.schema = schema;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	
	
}
