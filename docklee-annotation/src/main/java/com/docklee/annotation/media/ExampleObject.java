package com.docklee.annotation.media;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>ExampleObject</code> may be used to add one or more examples to the definition of a parameter, request or response content, by defining it as field Parameter.examples() or Content.examples().
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#exampleObject">Example (OpenAPI specification)</a>
 */
@Target(value=ANNOTATION_TYPE)
@Retention(value=RUNTIME)
@Inherited
public @interface ExampleObject {

	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * A URL to point to an external document to be used as an example. This is mutually exclusive with the value property.
	 * @return An external URL of the example.
	 * */
	String externalValue() default "";
	/**
	 * A unique name to identify this particular example.
	 * @return The name of the example.
	 * */
	String name() default "";
	/**
	 * A reference to a example defined in components examples.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * A brief summary of the purpose or context of the example.
	 * @return A summary of the example.
	 * */
	String summary() default "";
	/**
	 * A string representation of the example. This is mutually exclusive with the externalValue property, and ignored if the externalValue property is specified. If the media type associated with the example allows parsing into an object, it may be converted from a string.
	 * @return The value of the example.
	 * */
	String value() default "";
}
