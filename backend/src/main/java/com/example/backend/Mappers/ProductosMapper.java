package com.example.backend.Mappers;

import com.example.backend.Models.Productos;
import com.example.backend.Repository.Entities.ProductosEntity;

public class ProductosMapper {

    public static ProductosEntity toEntity(Productos producto) {
        if (producto == null) return null;
        return new ProductosEntity(
            producto.getIdProducto(),
            producto.getNombreProducto(),
            producto.getPrecioProducto(),
            producto.getDescripcionProducto(),
            producto.getStockProducto(),
            null // No mapeamos las ventas aquí
        );
    }

    public static Productos toModel(ProductosEntity entity) {
        if (entity == null) return null;
        return new Productos(
            entity.getIdProducto(),
            entity.getNombreProducto(),
            entity.getPrecioProducto(),
            entity.getDescripcionProducto(),
            entity.getStockProducto()
        );
    }
}
