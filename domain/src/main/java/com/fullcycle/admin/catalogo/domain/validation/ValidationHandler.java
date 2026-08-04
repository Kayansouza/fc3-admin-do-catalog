package com.fullcycle.admin.catalogo.domain.validation;

import java.util.List;

public interface ValidationHandler {

    ValidationHandler append(Error anError);

    ValidationHandler append(ValidationHandler aHandler);

    ValidationHandler append(Validation aValidation);

    default boolean hasErrors() {
        final var errors = getErrors();
        return errors != null && !errors.isEmpty();
    }

    List<Error> getErrors();

    interface Validation {
        void validate();
    }
}
