package com.docklee.core.exception;

public class LoadResourceException extends RuntimeException {

	public LoadResourceException() {
	}

	public LoadResourceException(final String s) {
		super(s);
	}

	public LoadResourceException(final String s, final Throwable throwable) {
		super(s, throwable);
	}

	public LoadResourceException(final Throwable throwable) {
		super(throwable);
	}

	public LoadResourceException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
		super(s, throwable, b, b1);
	}
}
