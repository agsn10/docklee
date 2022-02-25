package com.docklee.annotation.links;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;
import com.docklee.annotation.operations.Server;


/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>Link</code> may be applied in ApiResponse.links() to add OpenAPI links to a response.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 * @see <a href="https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#linkObject">Link (OpenAPI specification)</a>
 */
@Target(value=ANNOTATION_TYPE)
@Retention(value=RUNTIME)
@Inherited
public @interface Link {

	/**
	 * A description of the link. CommonMark syntax may be used for rich text representation.
	 * @return The link's description.
	 * */
	String description() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The name of this link.
	 * @return the link's name.
	 * */
	String name() default "";
	/**
	 * The name of an existing, resolvable OAS operation, as defined with a unique operationId. This field is mutually exclusive of the operationRef field.
	 * @return An operation ID.
	 * */
	String operationId() default "";
	/**
	 * A relative or absolute reference to an OAS operation. This field is mutually exclusive of the operationId field, and must point to an Operation Object. Relative operationRef values may be used to locate an existing Operation Object in the OpenAPI definition. Ignored if the operationId property is specified.
	 * @return An operation reference.
	 * */
	String operationRef() default "";
	/**
	 * Array of parameters to pass to an operation as specified with operationId or identified via operationRef.
	 * @return The list of parameters for this link.
	 * */
	LinkParameter[] parameters();
	/**
	 * A reference to a link defined in components links.
	 * @return The reference.
	 * */
	String ref() default "";
	/**
	 * A literal value or {expression} to use as a request body when calling the target operation.
	 * @return The request body of this link.
	 * */
	String requestBody() default "";
	/**
	 * An alternative server to service this operation.
	 * @return The server associated to this link.
	 * */
	Server server() default @Server;
	
}
