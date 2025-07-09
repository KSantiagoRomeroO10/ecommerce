package com.example.backend.Ports.Out;

import com.example.backend.Models.Vendedores;

import java.util.List;
import java.util.Optional;

public interface VendedoresOut {
  Vendedores guardarVendedor(Vendedores vendedor);
  Optional<Vendedores> buscarVendedorPorId(Integer id);
  List<Vendedores> listarVendedores();
  Vendedores actualizarVendedor(Vendedores vendedor);
  void eliminarVendedor(Integer id);
}