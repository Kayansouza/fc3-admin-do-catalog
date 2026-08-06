package com.fullcycle.admin.catalogo.application;

import com.fullcycle.admin.catalogo.domain.category.Category;


// Por padrão os casos de uso implementam o Parteny Command
// Parteny Command ele carrega uma semântica no nome da class e ele tem um único método chamado ' Execute '
// Ele recebe alguma coisa e sempre retorna algo
public abstract class UseCase<IN, OUT> {


    public abstract OUT execute( IN anIn);
}