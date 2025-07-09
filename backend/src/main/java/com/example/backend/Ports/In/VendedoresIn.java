package com.example.backend.Ports.In;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Vendedores;

public interface VendedoresIn {
  Vendedores crearVendedor(Vendedores vendedor);
  Optional<Vendedores> obtenerVendedorPorId(Long id);
  List<Vendedores> listarVendedores();
  Vendedores actualizarVendedor(Long id, Vendedores vendedor);
  Long eliminarVendedor(Long id);
}
