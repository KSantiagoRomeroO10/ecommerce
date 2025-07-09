package com.example.backend.Service;

import com.example.backend.Models.VentaProducto;
import com.example.backend.Ports.In.VentaProductoIn;
import com.example.backend.Ports.Out.VentaProductoOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaProductoService implements VentaProductoIn {
  private final VentaProductoOut ventaProductoOut;

  public VentaProductoService(VentaProductoOut ventaProductoOut) {
    this.ventaProductoOut = ventaProductoOut;
  }

  @Override
  public VentaProducto crearVentaProducto(VentaProducto ventaProducto) {
    return ventaProductoOut.guardarVentaProducto(ventaProducto);
  }

  @Override
  public Optional<VentaProducto> obtenerVentaProductoPorId(Long id) {
    return ventaProductoOut.buscarVentaProductoPorId(id);
  }

  @Override
  public List<VentaProducto> listarVentaProductos() {
    return ventaProductoOut.listarVentaProductos();
  }

  @Override
  public VentaProducto actualizarVentaProducto(Long id, VentaProducto ventaProducto) {
    Optional<VentaProducto> existente = ventaProductoOut.buscarVentaProductoPorId(id);
    if (existente.isPresent()) {
      ventaProducto.setIdVentaProducto(id);
      return ventaProductoOut.actualizarVentaProducto(ventaProducto);
    } else {
      throw new RuntimeException("VentaProducto no encontrado con id: " + id);
    }
  }

  @Override
  public void eliminarVentaProducto(Long id) {
    ventaProductoOut.eliminarVentaProducto(id);
  }
}
