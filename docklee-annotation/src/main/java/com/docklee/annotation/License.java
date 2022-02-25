package com.docklee.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>License</code> may be used in Info.license() to define a license.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-20200 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface License {
	/**
	 * The list of optional extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * he license name used for the API.
	 * */
	String name() default "";
	/**
	 * A URL to the license used for the API.
	 * */
	String url() default ""; 
}
