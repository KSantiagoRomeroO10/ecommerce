package com.example.backend.Ports.Out;

import com.example.backend.Models.VentaProducto;

import java.util.List;
import java.util.Optional;

public interface VentaProductoOut {
  VentaProducto guardarVentaProducto(VentaProducto ventaProducto);
  Optional<VentaProducto> buscarVentaProductoPorId(Long id);
  List<VentaProducto> listarVentaProductos();
  VentaProducto actualizarVentaProducto(VentaProducto ventaProducto);
  Long eliminarVentaProducto(Long id);
}
