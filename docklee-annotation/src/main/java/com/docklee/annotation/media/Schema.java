package com.docklee.annotation.media;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.ExternalDocumentation;
import com.docklee.annotation.extensions.Extension;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Schema</code> may be used to define a Schema for a set of elements of the OpenAPI spec, and/or to define additional properties for the schema. It is applicable e.g. to parameters, schema classes (aka "models"), properties of such models, request and response content, header.
 * </p>
 * 
 * <p>The annotation may be used also to override partly (e.g. the name) or fully (e.g providing a completely different representation) the schema of an element; for example if a specific class is provided as value of implementation(), it will override the element type.</p>
 * 
 * <p>The annotation ArraySchema shall be used for array elements; ArraySchema and Schema cannot coexist.</p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#schemaObject">Schema (OpenAPI specification)</a>
 */
@Target(value={FIELD,METHOD,PARAMETER,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface Schema {
	
	enum AccessMode {
		AUTO, READ_ONLY, READ_WRITE, WRITE_ONLY
    }
	
	/**
	 * Allows to specify the access mode (AccessMode.READ_ONLY, READ_WRITE) AccessMode.READ_ONLY: value will only be written to during a request but not returned during a response. AccessMode.WRITE_ONLY: value will only be written to during a request but not returned during a response. AccessMode.READ_WRITE: value will be written to during a request and returned during a response.
	 * @return The accessMode for this schema (property).
	 * */
	Schema.AccessMode accessMode() default Schema.AccessMode.AUTO;
	/**
	 * Provides an array of java class implementations which can be used to describe multiple acceptable schemas. If all match, the schema will be considered valid.
	 * @return The list of classes to match.
	 * */
	Class<?>[] allOf() default {};
	/**
	 * Provides a list of allowable values. This field map to the enum property in the OAS schema.
	 * @return A list of allowed schema values.
	 * */
	String[] allowableValues() default {};
	/**
	 * Provides an array of java class implementations which can be used to describe multiple acceptable schemas. If any match, the schema will be considered valid.
	 * @return The list of possible class matches.
	 * */
	Class<?>[] anyOf() default {};
	/**
	 * Provides a default value.
	 * @return The default value of this schema.
	 * */
	String defaultValue() default "";
	/**
	 * Specifies that a schema is deprecated and should be transitioned out of usage.
	 * @return Whether or not this schema is deprecated.
	 * */
	boolean deprecated() default false;
	/**
	 * Provides an optional override for the format. If a consumer is unaware of the meaning of the format, they shall fall back to using the basic type without format. For example, if \"type: integer, format: int128\" were used to designate a very large integer, most consumers will not understand how to handle it, and fall back to simply \"type: integer\"
	 * @return The schema's format.
	 * */
	String description() default "";
	/**
	 * Provides discriminator mapping values.
	 * @return The discriminator mappings.
	 * */
	DiscriminatorMapping[] discriminatorMapping() default {};
	/**
	 * Provides a discriminator property value.
	 * @return The discriminator property.
	 * */
	String discriminatorProperty() default "";
	/**
	 * Provides an example of the schema. When associated with a specific media type, the example string shall be parsed by the consumer to be treated as an object or an array.
	 * @return An example of this schema.
	 * */
	String example() default "";
	/**
	 * If true, makes the maximum value exclusive, or a less-than criteria.
	 * @return The exclusive maximum value for this schema.
	 * */
	boolean exclusiveMaximum() default false;
	/**
	 * If true, makes the minimum value exclusive, or a greater-than criteria.
	 * @return The exclusive minimum value for this schema.
	 * */
	boolean exclusiveMinimum() default false;
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Additional external documentation for this schema.
	 * @return Additional schema documentation.
	 * */
	ExternalDocumentation externalDocs() default @ExternalDocumentation;
	/**
	 * Provides an optional override for the format. If a consumer is unaware of the meaning of the format, they shall fall back to using the basic type without format. For example, if \"type: integer, format: int128\" were used to designate a very large integer, most consumers will not understand how to handle it, and fall back to simply \"type: integer\".
	 * @return The schema's format.
	 * */
	String format() default "";
	/**
	 * Allows schema to be marked as hidden.
	 * @return Whether or not this schema is hidden. 
	 * */
	boolean hidden() default false;
	/**
	 * Provides a java class as implementation for this schema. When provided, additional information in the Schema annotation (except for type information) will augment the java class after introspection.
	 * @return A class that implements this schema.
	 * */
	Class<?> implementation() default java.lang.Void.class;
	/**
	 * Sets the maximum numeric value for a property. Ignored if the value is an empty string.
	 * @return The maximum value for this schema.
	 * */
	String maximum() default "";
	/**
	 * Sets the maximum length of a string value. Ignored if the value is negative.
	 * @return The maximum length of this schema.
	 * */
	int maxLength() default 2147483647;
	/**
	 * Constrains the number of arbitrary properties when additionalProperties is defined. Ignored if value is 0.
	 * @return The maximum number of properties for this schema.
	 * */
	int maxProperties() default 0;
	/**
	 * Sets the minimum numeric value for a property. Ignored if the value is an empty string or not a number.
	 * @return The minimum value for this schema.
	 * */
	String minimum() default "";
	/**
	 * Sets the minimum length of a string value. Ignored if the value is negative.
	 * @return The minimum length of this schema.
	 * */
	int minLength() default 0;
	/**
	 * Constrains the number of arbitrary properties when additionalProperties is defined. Ignored if value is 0.
	 * @return The minimum number of properties for this schema.
	 * */
	int minProperties() default 0;
	/**
	 * Constrains a value such that when divided by the multipleOf, the remainder must be an integer. Ignored if the value is 0.
	 * @return The multiplier constraint of the schema.
	 * */
	double multipleOf() default 0.0;
	/**
	 * The name of the schema or property.
	 * @return The name of the schema.
	 * */
	String name() default "";
	/**
	 * Provides a java class to be used to disallow matching properties.
	 * @return A class with disallowed properties.
	 * */
	Class<?> not() default java.lang.Void.class;
	/**
	 * f true, designates a value as possibly null.
	 * @return Whether or not this schema is nullable.
	 * */
	boolean nullable() default false;
	/**
	 * Provides an array of java class implementations which can be used to describe multiple acceptable schemas. If more than one match the derived schemas, a validation error will occur.
	 * @return The list of possible classes for a single match.
	 * */
	Class<?>[] oneOf() default {};
	/**
	 * A pattern that the value must satisfy. Ignored if the value is an empty string.
	 * @return The pattern of this schema.
	 * */
	String pattern() default "";
	/**
	 * References a schema definition in an external OpenAPI document.
	 * @return A reference to this schema.
	 * */
	String ref() default "";
	/**
	 * Mandates that the annotated item is required or not.
	 * @return Whether or not this schema is required.
	 * */
	boolean required() default false;
	/**
	 * Allows multiple properties in an object to be marked as required.
	 * @return The list of required schema properties.
	 * */
	String[] requiredProperties() default {};
	/**
	 * An array of the sub types inheriting from this model.
	 * */
	Class<?>[] subTypes() default {};
	/**
	 * A title to explain the purpose of the schema.
	 * @return The title of the schema.
	 * */
	String title() default "";
	/**
	 * Provides an override for the basic type of the schema. Must be a valid type per the OpenAPI Specification.
	 * @return The type of this schema.
	 * */
	String type() default "";
}
