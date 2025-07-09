package com.example.backend.Repository.Adapters;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Ventas;
import com.example.backend.Ports.Out.VentasOut;

public class VentaProductoAdapter implements VentasOut{

  @Override
  public Ventas guardarVenta(Ventas venta) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'guardarVenta'");
  }

  @Override
  public Optional<Ventas> buscarVentaPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarVentaPorId'");
  }

  @Override
  public List<Ventas> listarVentas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarVentas'");
  }

  @Override
  public Ventas actualizarVenta(Ventas venta) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarVenta'");
  }

  @Override
  public Long eliminarVenta(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarVenta'");
  }
  
}
