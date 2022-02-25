package com.docklee.annotation.headers;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.media.Schema;

/**
 * <p><b>Gandlee Framework</b> - Gandlee TechWorks</p>
 * <p>
 * The annotation <code>Header</code> may be used to add one or more headers to the definition of a response or as attribute of content encoding by defining it as field ApiResponse.headers() or Content.encoding()..
 * </p>
 * 
 * <p>Please note that request headers are defined as Header Parameter.</p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 13-05-2019 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#headerObject">Header (OpenAPI specification)</a>
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface Header {

	/**
	 * Required: The name of the header. The name is only used as the key to store this header in a map.
	 * @return The header's name.
	 * */
	String name();
	/**
	 * Specifies that a header is deprecated and should be transitioned out of usage.
	 * @return Whether or not the header is deprecated.
	 * */
	boolean deprecated() default false;
	/**
	 * Additional description data to provide on the purpose of the header.
	 * @return The header's description.
	 * */
	String description() default "";
	/**
	 * A reference to a header defined in components headers.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * Determines whether this header is mandatory. The property may be included and its default value is false.
	 * @return Whether or not the header is required.
	 * */
	boolean required() default false;
	/***/
	Schema schema() default @Schema;
}
