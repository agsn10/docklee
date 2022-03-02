package com.docklee.core.exception;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <code>ResourceException</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 22-11-2020 
 * @see {@link ???}
 */
public class ResourceException extends RuntimeException {

	public ResourceException() {
	}

	public ResourceException(final String s) {
		super(s);
	}

	public ResourceException(final String s, final Throwable throwable) {
		super(s, throwable);
	}

	public ResourceException(final Throwable throwable) {
		super(throwable);
	}

	public ResourceException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
		super(s, throwable, b, b1);
	}
}
