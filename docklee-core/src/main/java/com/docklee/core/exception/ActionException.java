package com.docklee.core.exception;

/**
 * <p><b>Docklee</b> - Api Documentation</p>
 * <p>
 * 	The class <code>ActionException</code> ...
 * </p>
 * 
 * @author Antonio Neto [<()>] - Initial implementation.
 * @version 1.0.0
 * @since 03-11-2020 
 */
public class ActionException extends RuntimeException {

	public ActionException() {
	}

	public ActionException(final String s) {
		super(s);
	}

	public ActionException(final String s, final Throwable throwable) {
		super(s, throwable);
	}

	public ActionException(final Throwable throwable) {
		super(throwable);
	}

	public ActionException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
		super(s, throwable, b, b1);
	}
}
