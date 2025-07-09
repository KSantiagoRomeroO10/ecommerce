package com.example.backend.Service;

import com.example.backend.Models.Productos;
import com.example.backend.Ports.In.ProductosIn;
import com.example.backend.Ports.Out.ProductosOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService implements ProductosIn {

  private final ProductosOut productosOut;

  public ProductosService(ProductosOut productosOut) {
    this.productosOut = productosOut;
  }

  @Override
  public Productos crearProducto(Productos producto) {
    return productosOut.guardarProducto(producto);
  }

  @Override
  public Optional<Productos> obtenerProductoPorId(Long id) {
    return productosOut.buscarProductoPorId(id);
  }

  @Override
  public List<Productos> listarProductos() {
    return productosOut.listarProductos();
  }

  @Override
  public Productos actualizarProducto(Long id, Productos producto) {
    Optional<Productos> existente = productosOut.buscarProductoPorId(id);
    if (existente.isPresent()) {
      producto.setIdProducto(id); // Asegura que se actualice el correcto
      return productosOut.actualizarProducto(producto);
    } else {
      throw new RuntimeException("Producto no encontrado con id: " + id);
    }
  }
  
  @Override
  public Long eliminarProducto(Long id) {
    return productosOut.eliminarProducto(id);
  }
}
