package com.docklee.model.pojo;

import java.io.Serializable;

import com.docklee.annotation.enums.Explode;
import com.docklee.annotation.enums.ParameterIn;
import com.docklee.annotation.enums.ParameterStyle;
import com.docklee.model.pojo.extensions.Extension;
import com.docklee.model.pojo.media.ArraySchema;
import com.docklee.model.pojo.media.Content;
import com.docklee.model.pojo.media.ExampleObject;
import com.docklee.model.pojo.media.Schema;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Parameter</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Parameter implements Serializable {


	private boolean allowEmptyValue = false;
	private boolean allowReserved = false;
	private ArraySchema array = new ArraySchema();
	private Content[] content = {};
	private boolean deprecated = false;
	private String description = "";
	private String example = "";
	private ExampleObject[] examples = {};
	private Explode explode = Explode.DEFAULT;
	private Extension[] extensions = {};
	private boolean hidden = false;
	private ParameterIn in = ParameterIn.DEFAULT;
	private String name = "";
	private String ref = "";
	private boolean required = false;
	private Schema schema = new Schema();
	private ParameterStyle style = ParameterStyle.DEFAULT;
	
	public boolean isAllowEmptyValue() {
		return allowEmptyValue;
	}
	public void setAllowEmptyValue(boolean allowEmptyValue) {
		this.allowEmptyValue = allowEmptyValue;
	}
	public boolean isAllowReserved() {
		return allowReserved;
	}
	public void setAllowReserved(boolean allowReserved) {
		this.allowReserved = allowReserved;
	}
	public ArraySchema getArray() {
		return array;
	}
	public void setArray(ArraySchema array) {
		this.array = array;
	}
	public Content[] getContent() {
		return content;
	}
	public void setContent(Content[] content) {
		this.content = content;
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
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public ExampleObject[] getExamples() {
		return examples;
	}
	public void setExamples(ExampleObject[] examples) {
		this.examples = examples;
	}
	public Explode getExplode() {
		return explode;
	}
	public void setExplode(Explode explode) {
		this.explode = explode;
	}
	public Extension[] getExtensions() {
		return extensions;
	}
	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public ParameterIn getIn() {
		return in;
	}
	public void setIn(ParameterIn in) {
		this.in = in;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public ParameterStyle getStyle() {
		return style;
	}
	public void setStyle(ParameterStyle style) {
		this.style = style;
	}
	
	
	
}
