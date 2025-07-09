package com.example.backend.Ports.Out;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Productos;

public interface ProductosOut {
  Productos guardarProducto(Productos producto);
  Optional<Productos> buscarProductoPorId(Long id);
  List<Productos> listarProductos();
  Productos actualizarProducto(Productos producto);
  Long eliminarProducto(Long id);
}
