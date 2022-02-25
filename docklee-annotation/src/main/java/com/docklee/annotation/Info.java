package com.docklee.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Info</code> may be used in APIDefinition.info() to populate the Info section of the API document.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#infoObject">Info (OpenAPI specification)</a> 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Info {

	/**
	 * The application's title.
	 * @return The application's title.
	 * */
	String title() default "";
	/**
	 * The version of the API definition.
	 * @return The application's version.
	 * */
	String version()default "";
	/**
	 * A short description of the application. CommonMark syntax can be used for rich text representation.
	 * @return The application's description.
	 * */
	String description() default "";
	/**
	 * A URL to the Terms of Service for the API. Must be in the format of a URL.
	 * @return The application's terms of service.
	 * */
	String termsOfService() default "";
	/**
	 * The license information for the exposed API.
	 * @return The license of the application.
	 * */
	License license() default @License;
	/**
	 * The contact information for the exposed API.
	 * @return A contact for the applicatio.
	 * */
	Contact contact() default @Contact;
}
