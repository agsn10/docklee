package com.docklee.annotation.operations;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.ExternalDocumentation;
import com.docklee.annotation.parameters.Parameter;
import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.parameters.RequestBody;
import com.docklee.annotation.responses.ApiResponse;
import com.docklee.annotation.security.SecurityRequirement;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Operation</code> may be used to define a resource method as an APIDefinition Operation, and/or to define additional properties for the Operation.
 * </p>
 * 
 * <p>This behaviour is controlled by configuration property `scanAllResources` which defaults to true. By setting this flag to false only @Operation annotated methods are considered.</p>
 *
 * <p>The following fields can also alternatively be defined at method level (as repeatable annotations in case of arrays), in this case method level annotations take precedence over @Operation annotation fields:</p>
 * 
 * <ul>
 *  <li>tags: @Tag</li>
 *  <li>externalDocs: @ExternalDocumentation</li>
 *  <li>parameters: @Parameter</li>
 *  <li>responses: @ApiResponse</li>
 *  <li>security: @SecurityRequirement</li>
 *  <li>servers: @Server</li>
 *  <li>extensions: @Extension</li>
 *  <li>hidden: @Hidden</li>
 * </ul>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#operationObject">Operation (OpenAPI specification)</a>
 */
@Target(value={METHOD,ANNOTATION_TYPE})
@Retention(value=RUNTIME)
@Inherited
public @interface Operation {

	/**
	 * Allows an operation to be marked as deprecated. Alternatively use the @Deprecated annotation.
	 * @return Whether or not this operation is deprecated.
	 * */
	boolean deprecated() default false;
	/**
	 * A verbose description of the operation.
	 * @return A description of this operation.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Additional external documentation for this operation.
	 * @return Additional documentation about this operation.
	 * */
	ExternalDocumentation externalDocs() default @ExternalDocumentation;
	/**
	 * Allows this operation to be marked as hidden.
	 * @return Whether or not this operation is hidde.
	 * */
	boolean hidden() default false;
	/**
	 * Ignores JsonView annotations while resolving operations and types.
	 * @return Whether or not to ignore JsonView annotations.
	 * */
	boolean ignoreJsonView() default false;
	/**
	 * The HTTP method for this operation.
	 * @return The HTTP method of this operation.
	 * */
	String method() default "";
	/**
	 * The operationId is used by third-party tools to uniquely identify this operation.
	 * @return The ID of this operation.
	 * */
	String operationId() default "";
	/**
	 * An optional array of parameters which will be added to any automatically detected parameters in the method itself.
	 * @return The list of parameters for this operation.
	 * */
	Parameter[] parameters() default {};
	/**
	 * Request body associated to the operation.
	 * @return A request body.
	 * */
	RequestBody requestBody() default @RequestBody;
	/**
	 * The list of possible responses as they are returned from executing this operation.
	 * @return The list of responses for this operation.
	 * */
	ApiResponse[] responses() default {};
	/**
	 * A declaration of which security mechanisms can be used for this operation.
	 * @return The array of security requirements for this Operation.
	 * */
	SecurityRequirement[] security() default {};
	/**
	 * An alternative server array to service this operation.
	 * @return The list of servers hosting this operation.
	 * */
	Server[] servers() default {};
	/**
	 * Provides a brief description of this operation. Should be 120 characters or less for proper visibility in console.
	 * @return A summary of this operation.
	 * */
	String summary() default "";
	/**
	 * Tags can be used for logical grouping of operations by resources or any other qualifier.
	 * @return The list of tags associated with this operation.
	 * */
	String[] tags() default {};
}
