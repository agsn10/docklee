package com.docklee.core.exception;

public class InitializerException extends RuntimeException {

	public InitializerException() {
	}

	public InitializerException(final String s) {
		super(s);
	}

	public InitializerException(final String s, final Throwable throwable) {
		super(s, throwable);
	}

	public InitializerException(final Throwable throwable) {
		super(throwable);
	}

	public InitializerException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
		super(s, throwable, b, b1);
	}
}
