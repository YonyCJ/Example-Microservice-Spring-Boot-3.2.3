package com.taller.mscategoria.service;

import com.taller.mscategoria.entity.CategoryEntity;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<CategoryEntity> listar();

    public CategoryEntity save(CategoryEntity categoria);

    public CategoryEntity update(CategoryEntity categoria);

    public Optional<CategoryEntity> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
