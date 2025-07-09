package com.example.backend.Ports.In;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Ventas;

public interface VentasIn {
  Ventas crearVenta(Ventas venta);
  Optional<Ventas> obtenerVentaPorId(Long id);
  List<Ventas> listarVentas();
  Ventas actualizarVenta(Long id, Ventas venta);
  void eliminarVenta(Long id);
}
