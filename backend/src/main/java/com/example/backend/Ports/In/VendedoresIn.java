package com.example.backend.Ports.In;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Productos;

public interface VendedoresIn {
  Productos crearProducto(Productos producto);
  Optional<Productos> obtenerProductoPorId(Long id);
  List<Productos> listarProductos();
  Productos actualizarProducto(Long id, Productos producto);
  Long eliminarProducto(Long id);
}
