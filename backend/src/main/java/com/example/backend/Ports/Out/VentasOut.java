package com.example.backend.Ports.Out;

import com.example.backend.Models.Ventas;

import java.util.List;
import java.util.Optional;

public interface VentasOut {
  Ventas guardarVenta(Ventas venta);
  Optional<Ventas> buscarVentaPorId(Long id);
  List<Ventas> listarVentas();
  Ventas actualizarVenta(Ventas venta);
  Long eliminarVenta(Long id);
}
