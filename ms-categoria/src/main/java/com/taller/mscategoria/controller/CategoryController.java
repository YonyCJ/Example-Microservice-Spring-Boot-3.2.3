package com.taller.mscategoria.controller;

import com.taller.mscategoria.entity.CategoryEntity;
import com.taller.mscategoria.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {

    private final CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<List<CategoryEntity>> list() {
        return ResponseEntity.ok().body(categoryService.listar());
    }

    @PostMapping()
    public ResponseEntity<CategoryEntity> save(@RequestBody CategoryEntity categoria) {
        return ResponseEntity.ok(categoryService.save(categoria));
    }

    @PutMapping()
    public ResponseEntity<CategoryEntity> update(@RequestBody CategoryEntity categoria) {
        return ResponseEntity.ok(categoryService.update(categoria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryEntity> listById(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok().body(categoryService.listarPorId(id).get());
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id) {
        categoryService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
