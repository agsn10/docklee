package com.docklee.model.pojo.media;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>ArraySchema</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class ArraySchema implements Serializable {

	private Schema arraySchema = new Schema();
	private Extension[] extensions = {};
	private int maxItems = -2147483648;
	private int minItems = 2147483647;
	private Schema schema = new Schema();
	private boolean uniqueItems = false;
	
	public Schema getArraySchema() {
		return arraySchema;
	}
	public void setArraySchema(Schema arraySchema) {
		this.arraySchema = arraySchema;
	}
	public Extension[] getExtensions() {
		return extensions;
	}
	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}
	public int getMaxItems() {
		return maxItems;
	}
	public void setMaxItems(int maxItems) {
		this.maxItems = maxItems;
	}
	public int getMinItems() {
		return minItems;
	}
	public void setMinItems(int minItems) {
		this.minItems = minItems;
	}
	public Schema getSchema() {
		return schema;
	}
	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	public boolean isUniqueItems() {
		return uniqueItems;
	}
	public void setUniqueItems(boolean uniqueItems) {
		this.uniqueItems = uniqueItems;
	}
	
	
	
}
