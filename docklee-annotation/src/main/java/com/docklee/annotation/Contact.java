package com.docklee.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Contact</code> may be used in Info.contact() to define a contact.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Contact {

	/**
	 * The email address of the contact person/organization.
	 * */
	String email() default "";
	/**
	 * The list of optional extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The identifying name of the contact person/organization.
	 * */
	String name() default "";
	/**
	 * The URL pointing to the contact information.
	 * */
	String url() default "";
}
