package com.docklee.annotation.extensions;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Extension</code> an optionally named list of extension properties.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#specificationExtensions">Specification extensions (OpenAPI specification)</a>
 */
@Target(value={FIELD,METHOD,PARAMETER,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Repeatable(value=Extensions.class)
public @interface Extension {
	/**
	 * The extension properties.
	 * @return The actual extension properties.
	 * @see ExtensionProperty
	 * */
	ExtensionProperty[] properties();
	/**
	 * An option name for these extensions.
	 * @return An option name for these extensions - will be prefixed with "x-".
	 * */
	String name() default "";
}
