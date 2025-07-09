package com.example.backend.Service;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Ventas;
import com.example.backend.Ports.In.VentasIn;

public class VentasSevice implements VentasIn{

  @Override
  public Ventas crearVenta(Ventas venta) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'crearVenta'");
  }

  @Override
  public Optional<Ventas> obtenerVentaPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtenerVentaPorId'");
  }

  @Override
  public List<Ventas> listarVentas() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarVentas'");
  }

  @Override
  public Ventas actualizarVenta(Long id, Ventas venta) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarVenta'");
  }

  @Override
  public void eliminarVenta(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarVenta'");
  }
  
}
