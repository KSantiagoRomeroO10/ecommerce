package com.example.backend.Repository.Adapters;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.VentaProducto;
import com.example.backend.Ports.Out.VentaProductoOut;

public class VentasAdapter implements VentaProductoOut{

  @Override
  public VentaProducto guardarVentaProducto(VentaProducto ventaProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'guardarVentaProducto'");
  }

  @Override
  public Optional<VentaProducto> buscarVentaProductoPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarVentaProductoPorId'");
  }

  @Override
  public List<VentaProducto> listarVentaProductos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarVentaProductos'");
  }

  @Override
  public VentaProducto actualizarVentaProducto(VentaProducto ventaProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarVentaProducto'");
  }

  @Override
  public Long eliminarVentaProducto(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarVentaProducto'");
  }
  
}
