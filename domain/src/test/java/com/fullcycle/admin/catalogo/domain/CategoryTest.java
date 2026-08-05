package com.fullcycle.admin.catalogo.domain;

import com.fullcycle.admin.catalogo.domain.category.Category;
import com.fullcycle.admin.catalogo.domain.exceptions.DomainException;
import com.fullcycle.admin.catalogo.domain.validation.ThrowingValidationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CategoryTest {

    @Test
    public void givenAnInvalidNullName_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        final String expectedName = null;
        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'name' should not be null";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory = Category.newCategory(
                expectedName,
                expectedDescription,
                expectedIsActive
        );

        final var actualException = Assertions.assertThrows(
                DomainException.class,
                () -> actualCategory.validate()
        );

        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());
    }


    @Test
    public void givenAnInvalidNameLengthLessThan3_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        final String expectedName = "Fi";
        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'name' must be at least 3 characters";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory = Category.newCategory(
                expectedName,
                expectedDescription,
                expectedIsActive
        );

        final var actualException = Assertions.assertThrows(
                DomainException.class,
                () -> actualCategory.validate()
        );

        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());
    }


    @Test
    public void givenAnInvalidNameLengthMoreThan255_whenCallNewCategoryAndValidate_thenShouldReceiveError() {
        final String expectedName = "Desta maneira, a estruturação de redes de cooperação intersetorial consolida tendências que desafiam o status quo do levantamento das variáveis envolvidas. "
                + "É importante questionar o quanto o entendimento das metas propostas ressignifica os padrões de intervenção pública dos aprendizados oriundos da experiência acumulada. "
                + "Observando os marcos regulatórios, a articulação entre os diferentes níveis institucionais desafia a capacidade de equalização das interfaces entre as dimensões técnico-políticas.";

        final var expectedErrorCount = 1;
        final var expectedErrorMessage = "'name' must be less than 255 characters";
        final var expectedDescription = "A categoria mais assistida";
        final var expectedIsActive = true;

        final var actualCategory = Category.newCategory(
                expectedName,
                expectedDescription,
                expectedIsActive
        );

        final var actualException = Assertions.assertThrows(
                DomainException.class,
                () -> actualCategory.validate()
        );

        Assertions.assertEquals(expectedErrorCount, actualException.getErrors().size());
        Assertions.assertEquals(expectedErrorMessage, actualException.getErrors().get(0).message());
    }


    @Test
    public void givenAValidCategory_whenCallNewCategoryAndValidate_thenShouldNotReceiveError() {
        final String expectedName = "Filmes";
        final String expectedDescription = "Categoria de filmes";
        final var expectedIsActive = true;

        final var actualCategory = Category.newCategory(
                expectedName,
                expectedDescription,
                expectedIsActive
        );

        Assertions.assertDoesNotThrow(
                () -> actualCategory.validate(new ThrowingValidationHandler())
        );
    }


    @Test
    public void givenAValidFalseIsActive_whenCallNewCategoryAndValidate_thenShouldNotReceiveError() {
        final String expectedName = "Filmes";
        final String expectedDescription = "Categoria de filmes";
        final var expectedIsActive = false;

        final var actualCategory = Category.newCategory(
                expectedName,
                expectedDescription,
                expectedIsActive
        );

        Assertions.assertDoesNotThrow(
                () -> actualCategory.validate(new ThrowingValidationHandler())
        );
    }

}