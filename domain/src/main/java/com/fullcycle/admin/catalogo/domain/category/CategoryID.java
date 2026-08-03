package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.Indentifier;

import java.util.Objects;
import java.util.UUID;

public class CategoryID extends Indentifier {

    protected final String value;
    private CategoryID( final String value){
        Objects.requireNonNull(value);
        this.value = value;

    }

    // O unique vai responsavel por todas as vezes que precisar de um ID

    public static CategoryID unique(){
        return CategoryID.from(UUID.randomUUID());
    }

    // anID é responavel por chamar uma String.
    // Ex: Fomos no banco de dados e queremos converter um valor para um ID de category, o 'anID'
    // é responavel por chamar uma String.

    public static CategoryID from(final String anId){
        return new CategoryID(anId);

    }


    public static CategoryID from(final UUID anID){
        return new CategoryID(anID.toString().toLowerCase());
    }

    public  String getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CategoryID that = (CategoryID) o;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getValue());
    }
}
