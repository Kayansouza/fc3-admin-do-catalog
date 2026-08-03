package com.fullcycle.admin.catalogo.domain;

public class AggregateRoot< ID extends Indentifier> extends Entity<ID>{
    protected AggregateRoot(final ID id){
        super(id);
    }
}
