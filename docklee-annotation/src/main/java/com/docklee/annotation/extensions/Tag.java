package com.docklee.annotation.extensions;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.ExternalDocumentation;
import com.docklee.annotation.operations.Tags;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Tag</code> The annotation may be applied at class or method level, or in Operation.tags() to define tags for the single operation (when applied at method level) or for all operations of a class (when applied at class level)..
 * </p>
 * 
 * <p>
 * It can also be used in OpenAPIDefinition.tags() to define spec level tags.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={METHOD,TYPE,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Repeatable(value=Tags.class)
@Inherited
public @interface Tag {
	/**
	 * The name of this tag.
	 * */
	String name();
	/**
	 * The list of optional extensions.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Additional external documentation for this tag.
	 * */
	ExternalDocumentation externalDocs() default @ExternalDocumentation;
}
