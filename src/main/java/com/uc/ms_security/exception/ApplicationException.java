package com.uc.ms_security.exception;
// Sirve para personalizar lo que son las excepciones.
public class ApplicationException extends RuntimeException {

    private final ErrorCase errorCase;

    public ApplicationException(ErrorCase errorCase, String message) {
        super(message);
        this.errorCase = errorCase;
    }

    public ErrorCase getErrorCase() {
        return errorCase;
    }
}