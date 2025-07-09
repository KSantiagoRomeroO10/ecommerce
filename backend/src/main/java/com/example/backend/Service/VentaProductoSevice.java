package com.example.backend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.backend.Models.VentaProducto;
import com.example.backend.Ports.In.VentaProductoIn;

@Service
public class VentaProductoSevice implements VentaProductoIn {

  @Override
  public VentaProducto crearVentaProducto(VentaProducto ventaProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'crearVentaProducto'");
  }

  @Override
  public Optional<VentaProducto> obtenerVentaProductoPorId(Integer id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtenerVentaProductoPorId'");
  }

  @Override
  public List<VentaProducto> listarVentaProductos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarVentaProductos'");
  }

  @Override
  public VentaProducto actualizarVentaProducto(Integer id, VentaProducto ventaProducto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarVentaProducto'");
  }

  @Override
  public void eliminarVentaProducto(Integer id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarVentaProducto'");
  }

}
