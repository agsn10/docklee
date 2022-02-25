package com.docklee.annotation.operations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.ServerVariable;
import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Server</code> may be applied at class or method level, or in Operation.servers() to define servers for the single operation (when applied at method level) or for all operations of a class (when applied at class level).
 * </p>
 * <p>It can also be used in OpenAPIDefinition.servers() to define spec level servers.</p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#serverObject">Server (OpenAPI specification)</a>
 */
@Target(value={METHOD,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Repeatable(value=Servers.class)
@Inherited
public @interface Server {
	/**
	 * An optional string describing the host designated by the URL. CommonMark syntax MAY be used for rich text representation.
	 * @return String description.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Required. A URL to the target host. This URL supports Server Variables and may be relative, to indicate that the host location is relative to the location where the OpenAPI definition is being served. Variable substitutions will be made when a variable is named in {brackets}.
	 * @return String url.
	 * */
	String 	url() default "";
	/**
	 * An array of variables used for substitution in the server's URL template.
	 * @return Array of ServerVariables.
	 * */
	ServerVariable[]  variables() default {};
}
