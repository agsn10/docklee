package com.docklee.model.pojo.media;

import java.io.Serializable;

import com.docklee.model.pojo.ExternalDocumentation;
import com.docklee.model.pojo.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The class <code>Schema</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 28-02-2022
 */
public class Schema implements Serializable{


	private com.docklee.annotation.media.Schema.AccessMode accessMode = com.docklee.annotation.media.Schema.AccessMode.AUTO;
	private Class<?>[] allOf = {};
	private String[] allowableValues = {};
	private Class<?>[] anyOf = {};
	private String defaultValue = "";
	private boolean deprecated = false;
	private String description = "";
	private DiscriminatorMapping[] discriminatorMapping = {};
	private String discriminatorProperty = "";
	private String example = "";
	private boolean exclusiveMaximum = false;
	private boolean exclusiveMinimum = false;
	private Extension[] extensions = {};
	private ExternalDocumentation externalDocs = new ExternalDocumentation();
	private String format = "";
	private boolean hidden = false;
	private Class<?> implementation = Void.class;
	private String maximum = "";
	private int maxLength = 2147483647;
	private int maxProperties = 0;
	private String minimum = "";
	private int minLength = 0;
	private int minProperties = 0;
	private double multipleOf = 0.0;
	private String name = "";
	private Class<?> not = Void.class;
	private boolean nullable = false;
	private Class<?>[] oneOf = {};
	private String pattern = "";
	private String ref = "";
	private boolean required = false;
	private String[] requiredProperties = {};
	private Class<?>[] subTypes = {};
	private String title = "";
	private String type = "";
	
	public com.docklee.annotation.media.Schema.AccessMode getAccessMode() {
		return accessMode;
	}
	public void setAccessMode(com.docklee.annotation.media.Schema.AccessMode accessMode) {
		this.accessMode = accessMode;
	}
	public Class<?>[] getAllOf() {
		return allOf;
	}
	public void setAllOf(Class<?>[] allOf) {
		this.allOf = allOf;
	}
	public String[] getAllowableValues() {
		return allowableValues;
	}
	public void setAllowableValues(String[] allowableValues) {
		this.allowableValues = allowableValues;
	}
	public Class<?>[] getAnyOf() {
		return anyOf;
	}
	public void setAnyOf(Class<?>[] anyOf) {
		this.anyOf = anyOf;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
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
	public DiscriminatorMapping[] getDiscriminatorMapping() {
		return discriminatorMapping;
	}
	public void setDiscriminatorMapping(DiscriminatorMapping[] discriminatorMapping) {
		this.discriminatorMapping = discriminatorMapping;
	}
	public String getDiscriminatorProperty() {
		return discriminatorProperty;
	}
	public void setDiscriminatorProperty(String discriminatorProperty) {
		this.discriminatorProperty = discriminatorProperty;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	public boolean isExclusiveMaximum() {
		return exclusiveMaximum;
	}
	public void setExclusiveMaximum(boolean exclusiveMaximum) {
		this.exclusiveMaximum = exclusiveMaximum;
	}
	public boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}
	public void setExclusiveMinimum(boolean exclusiveMinimum) {
		this.exclusiveMinimum = exclusiveMinimum;
	}
	public Extension[] getExtensions() {
		return extensions;
	}
	public void setExtensions(Extension[] extensions) {
		this.extensions = extensions;
	}
	public ExternalDocumentation getExternalDocs() {
		return externalDocs;
	}
	public void setExternalDocs(ExternalDocumentation externalDocs) {
		this.externalDocs = externalDocs;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public boolean isHidden() {
		return hidden;
	}
	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}
	public Class<?> getImplementation() {
		return implementation;
	}
	public void setImplementation(Class<?> implementation) {
		this.implementation = implementation;
	}
	public String getMaximum() {
		return maximum;
	}
	public void setMaximum(String maximum) {
		this.maximum = maximum;
	}
	public int getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	public int getMaxProperties() {
		return maxProperties;
	}
	public void setMaxProperties(int maxProperties) {
		this.maxProperties = maxProperties;
	}
	public String getMinimum() {
		return minimum;
	}
	public void setMinimum(String minimum) {
		this.minimum = minimum;
	}
	public int getMinLength() {
		return minLength;
	}
	public void setMinLength(int minLength) {
		this.minLength = minLength;
	}
	public int getMinProperties() {
		return minProperties;
	}
	public void setMinProperties(int minProperties) {
		this.minProperties = minProperties;
	}
	public double getMultipleOf() {
		return multipleOf;
	}
	public void setMultipleOf(double multipleOf) {
		this.multipleOf = multipleOf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Class<?> getNot() {
		return not;
	}
	public void setNot(Class<?> not) {
		this.not = not;
	}
	public boolean isNullable() {
		return nullable;
	}
	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}
	public Class<?>[] getOneOf() {
		return oneOf;
	}
	public void setOneOf(Class<?>[] oneOf) {
		this.oneOf = oneOf;
	}
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
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
	public String[] getRequiredProperties() {
		return requiredProperties;
	}
	public void setRequiredProperties(String[] requiredProperties) {
		this.requiredProperties = requiredProperties;
	}
	public Class<?>[] getSubTypes() {
		return subTypes;
	}
	public void setSubTypes(Class<?>[] subTypes) {
		this.subTypes = subTypes;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
