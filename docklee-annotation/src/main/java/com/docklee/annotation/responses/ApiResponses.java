package com.docklee.annotation.responses;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>ApiResponses</code>, container for repeatable ApiResponse annotation.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={METHOD,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface ApiResponses {

	/**
	 * The list of optional extensions
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * An array of ApiResponse annotations.
	 * @return The array of the ApiResponse.
	 * */
	ApiResponse[] value() default {};
}
