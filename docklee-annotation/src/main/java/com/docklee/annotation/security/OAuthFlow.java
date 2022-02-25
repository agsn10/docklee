package com.docklee.annotation.security;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.docklee.annotation.extensions.Extension;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * The annotation <code>OAuthFlow</code> configuration details for a supported OAuth Flow.
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
@Target(value={})
@Retention(value=RUNTIME)
@Inherited
public @interface OAuthFlow {

	/**
	 * The authorization URL to be used for this flow. This must be in the form of a URL. Applies to oauth2 ("implicit", "authorizationCode") type.
	 * @return The authorization url.
	 * */
	String authorizationUrl() default "";
	/**
	 * The list of optional extensions.
	 * @return An optional array of extensions.
	 * */
	Extension[] extensions() default {};
	/**
	 * The URL to be used for obtaining refresh tokens. This must be in the form of a URL. Applies to oauth2 type.
	 * @return The refresh url.
	 * */
	String refreshUrl() default "";
	/**
	 * The available scopes for the OAuth2 security scheme. Applies to oauth2 type.
	 * @return Array of scopes.
	 * */
	OAuthScope[] scopes() default {};
	/**
	 * The token URL to be used for this flow. This must be in the form of a URL. Applies to oauth2 ("password", "clientCredentials", "authorizationCode") type.
	 * @return The token url.
	 * */
	String tokenUrl() default "";
}
