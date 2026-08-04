package com.fullcycle.admin.catalogo.domain.validation;

import com.fullcycle.admin.catalogo.domain.validation.ValidationHandler;

public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(final ValidationHandler aHandler) {
        this.handler = aHandler;
    }

    protected ValidationHandler handler() {
        return this.handler;
    }

    public abstract void validate();
}