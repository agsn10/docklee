package com.docklee.model.pojo.media;

import java.io.Serializable;

import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Content</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Content implements Serializable{


	private ArraySchema array = new ArraySchema();
	private Encoding[] encoding = {};	
	private ExampleObject[] examples = {};
	private Extension[] extensions = {};
	private String mediaType = "";
	private Schema schema = new Schema();
	
	public Content() {
		super();
	}

	public Content(ArraySchema array, Encoding[] encoding, ExampleObject[] examples, Extension[] extensions,
			String mediaType, Schema schema) {
		super();
		this.array = array;
		this.encoding = encoding;
		this.examples = examples;
		this.extensions = extensions;
		this.mediaType = mediaType;
		this.schema = schema;
	}

	public ArraySchema getArray() {
		return array;
	}

	public void setArray(ArraySchema array) {
		this.array = array;
	}

	public Encoding[] getEncoding() {
		return encoding;
	}

	public void setEncoding(Encoding[] encoding) {
		this.encoding = encoding;
	}

	public ExampleObject[] getExamples() {
		return examples;
	}

	public void setExamples(ExampleObject[] examples) {
		this.examples = examples;
	}

	public Extension[] getExtensions() {
		return extensions;
	}

	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}
	
	
	
}
