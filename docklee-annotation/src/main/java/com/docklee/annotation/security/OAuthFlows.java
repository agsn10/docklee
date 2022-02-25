package com.docklee.annotation.security;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>OAuthFlows</code> allows configuration of the supported OAuth Flows.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface OAuthFlows {

	/**
	 * Configuration for the OAuth Authorization Code flow.
	 * @return OAuthFloe authorizationCode.
	 * */
	OAuthFlow authorizationCode() default @OAuthFlow;
	/**
	 * Configuration for the OAuth Client Credentials flow.
	 * @return OAuthFlow clientCredentials.
	 * */
	OAuthFlow clientCredentials() default @OAuthFlow;
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * Configuration for the OAuth Implicit flow.
	 * @return OAuthFlow implicit.
	 * */
	OAuthFlow implicit() default @OAuthFlow;
	/**
	 * Configuration for the OAuth Resource Owner Password flow.
	 * @return OAuthFlow password.
	 * */
	OAuthFlow password() default @OAuthFlow;
}
