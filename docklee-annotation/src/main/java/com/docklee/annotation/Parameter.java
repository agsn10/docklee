package com.docklee.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.enums.Explode;
import com.docklee.annotation.enums.ParameterIn;
import com.docklee.annotation.enums.ParameterStyle;
import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.media.ArraySchema;
import com.docklee.annotation.media.Content;
import com.docklee.annotation.media.ExampleObject;
import com.docklee.annotation.media.Schema;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Parameter</code>  may be used on a method parameter to define it as a parameter for the operation, and/or to define additional properties for the Parameter. It can also be used independently in Operation.parameters() or at method level to add a parameter to the operation, even if not bound to any method parameter.
 * </p>
 * 
 * <p>How to use:</p>
 * <pre>
 * public Response login( @Parameter(description = "The user name for login", required = true) @QueryParam("username") String username) { ... }
 * </pre>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={PARAMETER,METHOD,FIELD,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Repeatable(value = Parameters.class)
@Inherited
public @interface Parameter {

	/**
	 * When true, allows sending an empty value. If false, the parameter will be considered \"null\" if no value is present. This may create validation errors when the parameter is required.
	 * @return Whether or not the parameter allows empty values.
	 * */
	boolean allowEmptyValue() default false;
	/**
	 * Determines whether the parameter value should allow reserved characters, as defined by RFC3986. This property only applies to parameters with an in value of query. The default value is false. Ignored if the properties content or array are specified.
	 * @return Whether or not the parameter allows reserved characters.
	 * */
	boolean allowReserved() default false;
	/**
	 * The schema of the array that defines this parameter. Ignored if the property content is specified.
	 * @return The schema of the array.
	 * */
	ArraySchema array() default @ArraySchema;
	/**
	 * The representation of this parameter, for different media types.
	 * @return The content of the paramete.
	 * */
	Content[] content() default {};
	/**
	 * Specifies that a parameter is deprecated and should be transitioned out of usage.
	 * @return Whether or not the parameter is deprecated.
	 * */
	boolean deprecated() default false;
	/**
	 * Additional description data to provide on the purpose of the parameter.
	 * @return The parameter's description.
	 * */
	String description() default "";
	/**
	 * Provides an example of the schema. When associated with a specific media type, the example string shall be parsed by the consumer to be treated as an object or an array. Ignored if the properties examples, content or array are specified.
	 * @return An example of the parameter.
	 * */
	String example() default "";
	/**
	 * An array of examples of the schema used to show the use of the associated schema.
	 * @return Array of examples of the parameter.
	 * */
	ExampleObject[] examples() default {};
	/**
	 * When this is true, parameter values of type array or object generate separate parameters for each value of the array or key-value pair of the map. For other types of parameters this property has no effect. When style is form, the default value is true. For all other styles, the default value is false. Ignored if the properties content or array are specified.
	 * @return Whether or not to expand individual array members.
	 * */
	Explode explode() default Explode.DEFAULT;
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Allows this parameter to be marked as hidden.
	 * @return Whether or not this parameter is hidden.
	 * */
	boolean hidden() default false;
	/**
	 * The location of the parameter. Possible values are "query", "header", "path" or "cookie". Ignored when empty string.
	 * @return The parameter's location.
	 * */
	ParameterIn in() default ParameterIn.DEFAULT;
	/**
	 * The name of the parameter.
	 * @return The parameter's name.
	 * */
	String name() default "";
	/**
	 * A reference to a parameter defined in components parameter.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * Determines whether this parameter is mandatory. If the parameter location is "path", this property is required and its value must be true. Otherwise, the property may be included and its default value is false.
	 * @return Whether or not the parameter is required.
	 * */
	boolean required() default false;
	/**
	 * The schema defining the type used for the parameter. Ignored if the properties content or array are specified.
	 * @return The schema of the parameter.
	 * */
	Schema schema() default @Schema;
	/**
	 * Describes how the parameter value will be serialized depending on the type of the parameter value. Default values (based on value of in): for query - form; for path - simple; for header - simple; for cookie - form. Ignored if the properties content or array are specified.
	 * @return The style of the parameter.
	 * */
	ParameterStyle style() default ParameterStyle.DEFAULT;
}
