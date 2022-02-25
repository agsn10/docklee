package com.docklee.annotation.media;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Content</code> may be used to define the content/media type of a parameter, request or response, by defining it as field Parameter.content(), RequestBody.content() or ApiResponse.content().
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#exampleObject">Example (OpenAPI specification)</a>
 */
@Target(value=ANNOTATION_TYPE)
@Retention(value=RUNTIME)
@Inherited
public @interface Content {
	
	/**
	 * The schema of the array that defines the type used for the content.
	 * @return The schema of the array.
	 * */
	ArraySchema array() default @ArraySchema;
	/**
	 * An array of encodings The key, being the property name, MUST exist in the schema as a property.
	 * @return The array of encodings.
	 * */
	Encoding[] encoding() default {};
	/**
	 * An array of examples used to show the use of the associated schema.
	 * @return The list of examples.
	 * */
	ExampleObject[] examples() default {};
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The media type that this object applies to.
	 * @return The media type value.
	 * */
	String mediaType() default "";
	/**
	 * The schema defining the type used for the content.
	 * @return The schema of this media type.
	 * */
	Schema schema() default @Schema;
}
