package com.example.backend.Service;

import com.example.backend.Models.Productos;
import com.example.backend.Ports.In.ProductosIn;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService implements ProductosIn {

  @Override
  public Productos crearProducto(Productos producto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'crearProducto'");
  }

  @Override
  public Optional<Productos> obtenerProductoPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'obtenerProductoPorId'");
  }

  @Override
  public List<Productos> listarProductos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarProductos'");
  }

  @Override
  public Productos actualizarProducto(Long id, Productos producto) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarProducto'");
  }

  @Override
  public Long eliminarProducto(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarProducto'");
  }

}
