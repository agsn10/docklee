package com.docklee.model.pojo.media;

import java.io.Serializable;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>DiscriminatorMapping</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class DiscriminatorMapping implements Serializable {

	private Class<?> schema = Void.class;
	private String value = "";
	
	public DiscriminatorMapping() {
		super();
	}

	public DiscriminatorMapping(Class<?> schema, String value) {
		super();
		this.schema = schema;
		this.value = value;
	}

	public Class<?> getSchema() {
		return schema;
	}

	public void setSchema(Class<?> schema) {
		this.schema = schema;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
