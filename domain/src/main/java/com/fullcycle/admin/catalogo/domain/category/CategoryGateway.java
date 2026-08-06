package com.fullcycle.admin.catalogo.domain.category;

import com.fullcycle.admin.catalogo.domain.pagination.Pagination;

import java.util.Optional;


// só uma interface

public interface CategoryGateway {

    Category create( Category aCategory);

    void deleteByUd(CategoryID anID);

    Optional <Category> findyId(CategoryID anId);

    Category update  (Category aCategory);

    Pagination<Category> findAll(CategorySeachQuery aQuery);
}

