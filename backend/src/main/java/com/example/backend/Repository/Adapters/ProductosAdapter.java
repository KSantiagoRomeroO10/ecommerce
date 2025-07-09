package com.example.backend.Repository.Adapters;

import com.example.backend.Mappers.ProductosMapper;
import com.example.backend.Models.Productos;
import com.example.backend.Ports.Out.ProductosOut;
import com.example.backend.Repository.JpaRepository.ProductosJpaRepository;
import com.example.backend.Repository.Entities.ProductosEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductosAdapter implements ProductosOut {

    private final ProductosJpaRepository productosJpaRepository;

    @Autowired
    public ProductosAdapter(ProductosJpaRepository productosJpaRepository) {
        this.productosJpaRepository = productosJpaRepository;
    }

    @Override
    public Productos guardarProducto(Productos producto) {
        ProductosEntity entity = ProductosMapper.toEntity(producto);
        ProductosEntity guardado = productosJpaRepository.save(entity);
        return ProductosMapper.toModel(guardado);
    }

    @Override
    public Optional<Productos> buscarProductoPorId(Long id) {
        return productosJpaRepository.findById(id)
                .map(ProductosMapper::toModel);
    }

    @Override
    public List<Productos> listarProductos() {
        return productosJpaRepository.findAll().stream()
                .map(ProductosMapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public Productos actualizarProducto(Productos producto) {
        ProductosEntity entity = ProductosMapper.toEntity(producto);
        ProductosEntity actualizado = productosJpaRepository.save(entity);
        return ProductosMapper.toModel(actualizado);
    }

    @Override
    public Long eliminarProducto(Long id) {
        productosJpaRepository.deleteById(id);
        return id;
    }
}
