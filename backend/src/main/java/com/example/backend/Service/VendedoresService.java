package com.example.backend.Service;

import com.example.backend.Models.Vendedores;
import com.example.backend.Ports.In.VendedoresIn;
import com.example.backend.Ports.Out.VendedoresOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendedoresService implements VendedoresIn {

    private final VendedoresOut vendedoresOut;

    public VendedoresService(VendedoresOut vendedoresOut) {
        this.vendedoresOut = vendedoresOut;
    }

    @Override
    public Vendedores crearVendedor(Vendedores vendedor) {
        return vendedoresOut.guardarVendedor(vendedor);
    }

    @Override
    public Optional<Vendedores> obtenerVendedorPorId(Long id) {
        return vendedoresOut.buscarVendedorPorId(id);
    }

    @Override
    public List<Vendedores> listarVendedores() {
        return vendedoresOut.listarVendedores();
    }

    @Override
    public Vendedores actualizarVendedor(Long id, Vendedores vendedor) {
        Optional<Vendedores> existente = vendedoresOut.buscarVendedorPorId(id);
        if (existente.isPresent()) {
            vendedor.setIdVendedor(id); // Asegúrate de que este método exista en tu clase modelo
            return vendedoresOut.actualizarVendedor(vendedor);
        } else {
            throw new RuntimeException("Vendedor no encontrado con id: " + id);
        }
    }

    @Override
    public Long eliminarVendedor(Long id) {
      return vendedoresOut.eliminarVendedor(id);
    }
}
