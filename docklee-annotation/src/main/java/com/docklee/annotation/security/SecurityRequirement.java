package com.docklee.annotation.security;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>SecurityRequirement</code> may be applied at class or method level, or in Operation.security() ()} to define security requirements for the single operation (when applied at method level) or for all operations of a class (when applied at class level).
 * </p>
 * <p>It can also be used in OpenAPIDefinition.security() to define spec level security.</p>
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Retention(RUNTIME)
@Target(value= {METHOD,TYPE,ANNOTATION_TYPE})
@Repeatable(value = SecurityRequirements.class)
@Inherited
public @interface SecurityRequirement {
	/**
	 * 	This name must correspond to a declared SecurityRequirement.
	 * */
	String name() default "";
	/**
	 * If the security scheme is of type "oauth2" or "openIdConnect", then the value is a list of scope names required for the execution. For other security scheme types, the array must be empty.
	 *@return String array of scopes.
	 * */
	String[] scopes() default {};
}
