package com.docklee.annotation.callbacks;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.operations.Operation;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Callback</code> may be used at method level to add one ore more callbacks to the operation definition.
 * </p>
 *
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#callbackObject">Callback (OpenAPI specification)</a>
 */
@Target(value={FIELD,METHOD,PARAMETER,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Repeatable(value=Callbacks.class)
@Inherited
public @interface Callback {

	/**
	 * An absolute URL which defines the destination which will be called with the supplied operation definition.
	 * @return The callback URL.
	 * */
	String callbackUrlExpression() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The friendly name used to refer to this callback.
	 * @return The name of the callback.
	 * */
	String name() default "";
	/**
	 * The array of operations that will be called out-of band.
	 * @return The callback operations.
	 * */
	Operation[] operation() default {};
	/**
	 * A reference to a Callback defined in components Callbacks.
	 * @return The reference.
	 * */
	String ref() default "";
}
