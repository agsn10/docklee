package com.docklee.annotation.callbacks;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Callbacks</code>, container for repeatable Callback annotation.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={METHOD,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface Callbacks {

	/**
	 * An array of Callback annotations which are a map of possible out-of band callbacks related to the parent operation.
	 * @return The array of the callbacks.
	 * */
	Callback[] value() default {};
}
