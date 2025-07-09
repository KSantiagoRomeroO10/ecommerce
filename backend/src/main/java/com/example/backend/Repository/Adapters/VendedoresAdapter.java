package com.example.backend.Repository.Adapters;

import java.util.List;
import java.util.Optional;

import com.example.backend.Models.Vendedores;
import com.example.backend.Ports.Out.VendedoresOut;

public class VendedoresAdapter implements VendedoresOut{

  @Override
  public Vendedores guardarVendedor(Vendedores vendedor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'guardarVendedor'");
  }

  @Override
  public Optional<Vendedores> buscarVendedorPorId(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'buscarVendedorPorId'");
  }

  @Override
  public List<Vendedores> listarVendedores() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarVendedores'");
  }

  @Override
  public Vendedores actualizarVendedor(Vendedores vendedor) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'actualizarVendedor'");
  }

  @Override
  public Long eliminarVendedor(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eliminarVendedor'");
  }

}
