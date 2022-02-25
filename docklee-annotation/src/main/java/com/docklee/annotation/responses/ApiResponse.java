package com.docklee.annotation.responses;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.headers.Header;
import com.docklee.annotation.links.Link;
import com.docklee.annotation.media.Content;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>ApiResponse</code> may be used at method level or as field of Operation to define one or more responses of the Operation.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={METHOD,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
@Repeatable(value=ApiResponses.class)
public @interface ApiResponse {

	/**
	 * An array containing descriptions of potential response payloads, for different media types.
	 * @return Array of content.
	 * */
	Content[] content() default {};
	/**
	 * A short description of the response.
	 * @return Description of the response.
	 * */
	String description();
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * An array of response headers. Allows additional information to be included with response.
	 * @return Array of headers.
	 * */
	Header[] headers() default {};
	/**
	 * An array of operation links that can be followed from the response.
	 * @return Array of links.
	 * */
	Link[]  links() default {};
	/**
	 * A reference to a response defined in components responses.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * The HTTP response code, or 'default', for the supplied response. May only have 1 default entry.
	 * @return Response code.
	 * */
	String responseCode() default "default";
}
