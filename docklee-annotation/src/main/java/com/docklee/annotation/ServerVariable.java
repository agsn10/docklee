package com.docklee.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>ServerVariable</code> an object representing a Server Variable for server URL template substitution.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={})
@Retention(RUNTIME)
@Inherited
public @interface ServerVariable {
	/**
	 * Required.
	 * */
	String defaultValue();
	/**
	 * Required.
	 * */
	String name();
	/**
	 * An array of allowable values for this variable.
	 * */
	String[] allowableValues() default "";
	/**
	 * An optional description for the server variable.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * */
	Extension[] extensions() default {};
}
