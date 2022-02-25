package com.docklee.annotation.parameters;


import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.media.Content;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Server</code> may be used on a method parameter to define it as the Request Body of the operation, and/or to define additional properties for such request body.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#requestBodyObject">Request Body (OpenAPI specification)</a>
 */
@Target(value={METHOD,PARAMETER,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface RequestBody {

	/**
	 * The content of the request body.
	 * @return Array of content.
	 * */
	Content[] content() default {};
	/**
	 * A brief description of the request body.
	 * @return Description of the request body.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * A reference to a RequestBody defined in components RequestBodies.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * Determines if the request body is required in the request. Defaults to false.
	 * @return boolean.
	 * */
	boolean required() default false;
}
