package com.docklee.annotation.security;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>SecurityRequirements</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Retention(RUNTIME)
@Target(value={METHOD,TYPE,ANNOTATION_TYPE})
@Inherited
public @interface SecurityRequirements {
	/**
	 * An array of SecurityRequirement annotations
	 * */
	SecurityRequirement[] value();
}
