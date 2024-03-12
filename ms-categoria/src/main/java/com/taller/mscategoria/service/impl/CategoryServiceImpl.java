package com.taller.mscategoria.service.impl;

import com.taller.mscategoria.entity.CategoryEntity;
import com.taller.mscategoria.repository.CategoryRepository;
import com.taller.mscategoria.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryEntity> listar() {
        return categoryRepository.findAll();
    }

    @Override
    public CategoryEntity save(CategoryEntity categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public CategoryEntity update(CategoryEntity categoria) {
        return categoryRepository.save(categoria);
    }

    @Override
    public Optional<CategoryEntity> listarPorId(Integer id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        categoryRepository.deleteById(id);
    }
}
