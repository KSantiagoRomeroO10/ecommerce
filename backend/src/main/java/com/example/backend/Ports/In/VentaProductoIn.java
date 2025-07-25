package com.example.backend.Ports.In;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.VentaProducto;

public interface VentaProductoIn {
  VentaProducto crearVentaProducto(VentaProducto ventaProducto);
  Optional<VentaProducto> obtenerVentaProductoPorId(Long id);
  List<VentaProducto> listarVentaProductos();
  VentaProducto actualizarVentaProducto(Long id, VentaProducto ventaProducto);
  Long eliminarVentaProducto(Long id);
}
