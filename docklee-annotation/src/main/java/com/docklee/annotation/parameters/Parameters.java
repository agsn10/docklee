package com.docklee.annotation.parameters;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Parameter</code>, container for repeatable Parameter annotation.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={METHOD,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface Parameters {
	/**
	 * An array of Parameters Objects for the operation.
	 * @return The parameters.
	 * */
	Parameter[] value() default {};
}
