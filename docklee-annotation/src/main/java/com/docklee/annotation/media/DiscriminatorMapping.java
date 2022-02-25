package com.docklee.annotation.media;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>DiscriminatorMapping</code> may be used in Schema.discriminatorMapping() to define an optional mapping definition in scenarios involving composition / inheritance where the value of the discriminator field does not match the schema name or implicit mapping is not possible..
 * </p>
 * 
 * <p>Use Schema.discriminatorProperty() to define a discriminator property..</p>
*
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#discriminatorObject">Discriminator (OpenAPI specification)</a>
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface DiscriminatorMapping {
	
	/**
	 * The schema that is being mapped to a property value.
	 * @return The Schema reference.
	 * */
	Class<?> schema() default java.lang.Void.class;
	/**
	 * The property value that will be mapped to a Schema.
	 * @return The property value.
	 * */
	String value() default "";
}
