package com.fullcycle.admin.catalogo.application;


// Ele vai recber alguma coisa, mas ele nunca vai me retorna

public abstract class UnitUseCase<IN>{

    public abstract void execute(IN anIn);
}
