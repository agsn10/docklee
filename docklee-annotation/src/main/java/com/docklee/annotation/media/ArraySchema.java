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

import com.docklee.annotation.extensions.Extension;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>ArraySchema</code> may be used to define a schema of type "array" for a set of elements of the OpenAPI spec, and/or to define additional properties for the schema. It is applicable e.g. to parameters, schema classes (aka "models"), properties of such models, request and response content, header.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#schemaObject">Schema (OpenAPI specification)</a>
 */
@Target(value={FIELD,METHOD,PARAMETER,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface ArraySchema {

	/**
	 * Allows to define the properties to be resolved into properties of the schema of type `array` (not the ones of the `items` of such schema which are defined in schema.
	 * @return ArraySchema.
	 * */
	Schema arraySchema() default @Schema;
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Sets the maximum number of items in an array. Ignored if value is Integer.MIN_VALUE.
	 * @return Integer representing maximum number of items in array
	 * */
	int maxItems() default -2147483648;
	/**
	 * Sets the minimum number of items in an array. Ignored if value is Integer.MAX_VALUE.
	 * @return Integer representing minimum number of items in array.
	 * */
	int minItems() default 2147483647;
	/**
	 * The schema of the items in the array.
	 * @return Schema.
	 * */
	Schema schema() default @Schema;
	/**
	 * Determines whether an array of items will be unique.
	 * @return Boolean - whether items in an array are unique or repeating.
	 * */
	boolean uniqueItems() default false;
}
