package com.fullcycle.admin.catalogo.domain;

import com.fullcycle.admin.catalogo.domain.validation.ValidationHandler;

public class AggregateRoot< ID extends Indentifier> extends Entity<ID>{
    protected AggregateRoot(final ID id){
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
