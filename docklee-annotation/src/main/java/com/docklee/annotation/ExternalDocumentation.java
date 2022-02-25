package com.docklee.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p>
 * <p><b>Docklee</b> - Api Documentation</p>
 * </p>
 * <p>
 * The annotation <code>ExternalDocumentation</code> may be used at method level or as field of Operation to add a reference to an external resource for extended documentation of an <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#operationObject"> Operation (OpenAPI specification)</a>.
 * </p>
 * <p>It may also be used to add external documentation to Tag, Header or Schema, or as field of APIDefinition.</p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-1-2020
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#externalDocumentationObject">External Documentation (OpenAPI specification)</a> 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ExternalDocumentation {

	/**
	 * A short description of the target documentation.
	 * @return The documentation description.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The URL for the target documentation. Value must be in the format of a URL.
	 * @return The documentation URL.
	 * */
	String url() default "";
}
