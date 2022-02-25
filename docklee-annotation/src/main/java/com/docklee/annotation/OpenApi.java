package com.docklee.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.extensions.Tag;
import com.docklee.annotation.operations.Server;
import com.docklee.annotation.security.SecurityRequirement;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>OpenApi</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface OpenApi {

	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Any additional external documentation for the API.
	 * @return The external documentation for this API.
	 * */
	ExternalDocumentation externalDocs() default @ExternalDocumentation;
	/**
	 * Provides metadata about the API. The metadata MAY be used by tooling as required.
	 * @return The metadata about this API.
	 * */
	Info info() default @Info;
	/**
	 * A declaration of which security mechanisms can be used across the API.
	 * @return The array of servers used for this API.
	 * */
	SecurityRequirement[] security() default {};
	/**
	 * An array of Server Objects, which provide connectivity information to a target server. If the servers property is not provided, or is an empty array, the default value would be a Server Object with a url value of /.
	 * @return The servers of this API.
	 * */
	Server[] servers() default {};
	/**
	 * A list of tags used by the specification with additional metadata. The order of the tags can be used to reflect on their order by the parsing tools.
	 * @return The tags used by the specification with any additional metadata.
	 * */
	Tag[] tags() default {};
}
