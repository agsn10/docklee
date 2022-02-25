package com.docklee.annotation.links;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>LinkParameter</code> represents a parameter to pass to an operation as specified with operationId or identified via operationRef..
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface LinkParameter {

	/**
	 * A constant or an expression to be evaluated and passed to the linked operation.
	 * @return The parameter's value.
	 * */
	String expression() default "";
	/**
	 * The name of this link parameter.
	 * @return The parameter's name.
	 * */
	String name() default "";
}
