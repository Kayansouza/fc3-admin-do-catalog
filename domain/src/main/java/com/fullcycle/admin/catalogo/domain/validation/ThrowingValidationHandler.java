package com.fullcycle.admin.catalogo.domain.validation;

import com.fullcycle.admin.catalogo.domain.exceptions.DomainException;
import java.util.ArrayList;
import java.util.List;

public class ThrowingValidationHandler implements ValidationHandler {

    private final List<Error> errors;

    private ThrowingValidationHandler(final List<Error> errors) {
        this.errors = errors;
    }

    public static ThrowingValidationHandler create() {
        return new ThrowingValidationHandler(new ArrayList<>());
    }

    @Override
    public ValidationHandler append(final Error anError) {
        this.errors.add(anError);
        return this;
    }

    @Override
    public ValidationHandler append(final ValidationHandler aHandler) {
        this.errors.addAll(aHandler.getErrors());
        return this;
    }

    @Override
    public ValidationHandler append(final Validation aValidation) {
        try {
            aValidation.validate();
        } catch (final Exception ex) {
            this.errors.add(new Error(ex.getMessage()));
        }
        return this;
    }

    @Override
    public List<Error> getErrors() {
        return this.errors;
    }

    public void validate() {
        if (hasErrors()) {
            throw DomainException.with(this.errors);
        }
    }
}
