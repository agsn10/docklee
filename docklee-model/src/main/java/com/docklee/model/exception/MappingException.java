package com.docklee.model.exception;

public class MappingException extends RuntimeException{

    public MappingException() {
    }

    public MappingException(final String s) {
        super(s);
    }

    public MappingException(final String s, final Throwable throwable) {
        super(s, throwable);
    }

    public MappingException(final Throwable throwable) {
        super(throwable);
    }

    public MappingException(final String s, final Throwable throwable, final boolean b, final boolean b1) {
        super(s, throwable, b, b1);
    }
}
