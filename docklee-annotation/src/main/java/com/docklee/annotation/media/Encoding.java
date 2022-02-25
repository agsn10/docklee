package com.docklee.annotation.media;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.headers.Header;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Encoding</code> may be used to add encoding details to the definition of a parameter, request or response content, by defining it as field Content.encoding().
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#encodingObject">Encoding (OpenAPI specification)</a>
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface Encoding {

	/**
	 * Determines whether the parameter value SHOULD allow reserved characters, as defined by RFC3986 to be included without percent-encoding.
	 * @return boolean
	 * */
	boolean allowReserved() default false;
	/**
	 * The Content-Type for encoding a specific property.
	 * @return Content type of the encoding.
	 * */
	String contentType() default "";
	/**
	 * When this is true, property values of type array or object generate separate parameters for each value of the array, or key-value-pair of the map.
	 * @return boolean
	 * */
	boolean explode() default false;
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions();
	/**
	 * An array of header objects.
	 * @return Array of headers.
	 * */
	Header[] headers() default {};
	/**
	 * The name of this encoding object instance. This property is a key in encoding map of MediaType object and MUST exist in a schema as a property.
	 * @return Name of the encoding.
	 * */
	String name() default "";
	/**
	 * Describes how a specific property value will be serialized depending on its type.
	 * @return Style of the encoding.
	 * */
	String style() default "";
}
