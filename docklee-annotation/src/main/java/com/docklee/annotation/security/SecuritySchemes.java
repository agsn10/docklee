package com.docklee.annotation.security;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>SecuritySchemes</code>, container for repeatable SecurityScheme annotation.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface SecuritySchemes {

	/**
	 * An array of SecurityScheme annotations
	 * @return The array of the SecurityScheme.
	 * */
	SecurityScheme[] value() default {};
}
