package com.example.backend.Ports.Out;

import com.example.backend.Models.Ventas;

import java.util.List;
import java.util.Optional;

public interface VentasOut {
  Ventas guardarVenta(Ventas venta);
  Optional<Ventas> buscarVentaPorId(Integer id);
  List<Ventas> listarVentas();
  Ventas actualizarVenta(Ventas venta);
  void eliminarVenta(Integer id);
}
