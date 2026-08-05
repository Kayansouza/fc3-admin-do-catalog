package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.validation.Validator;
import com.fullcycle.admin.catalogo.domain.validation.ValidationHandler;
import com.fullcycle.admin.catalogo.domain.validation.Error;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(
            final Category aCategory,
            final ValidationHandler aHandler
    ) {
        super(aHandler);
        this.category = aCategory;
    }

    @Override
    public void validate() {
        final var handler = handler();

        if (category.getName() == null || category.getName().isBlank()) {
            handler.append(new Error("'name' should not be null"));
            return;
        }

        if (category.getName().length() < 3) {
            handler.append(new Error("'name' must be at least 3 characters"));
        }

        if (category.getName().length() > 255) {
            handler.append(new Error("'name' must be less than 255 characters"));
        }


        if (category.getDescription() == null || category.getDescription().isBlank()) {
            handler.append(new Error("'description' should not be null"));
            return;
        }

        if (category.getDescription().length() < 3) {
            handler.append(new Error("'description' must be at least 3 characters"));
        }

        if (category.getDescription().length() > 255) {
            handler.append(new Error("'description' must be less than 255 characters"));
        }
    }
}
