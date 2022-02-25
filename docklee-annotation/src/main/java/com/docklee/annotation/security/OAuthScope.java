package com.docklee.annotation.security;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>OAuthScope</code> represents an OAuth scope.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface OAuthScope {

	/**
	 * Short description of the scope.
	 * @return String description.
	 * */
	String description() default "";
	/**
	 * Name of the scope.
	 * @return String name.
	 * */
	String name() default "";
}
