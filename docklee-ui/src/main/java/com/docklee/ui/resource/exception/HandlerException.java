package com.docklee.ui.resource.exception;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <code>ResourceException</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 27-02-2022
 * @see {@link ???}
 */
public class HandlerException extends RuntimeException {

	public HandlerException() {
	}

	public HandlerException(final String s) {
		super(s);
	}

	public HandlerException(final String s, final Throwable throwable) {
		super(s, throwable);
	}

	public HandlerException(final Throwable throwable) {
		super(throwable);
	}

	public HandlerException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
		super(s, throwable, b, b1);
	}
}