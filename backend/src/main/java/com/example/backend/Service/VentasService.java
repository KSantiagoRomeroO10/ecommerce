package com.example.backend.Service;

import com.example.backend.Models.Ventas;
import com.example.backend.Ports.In.VentasIn;
import com.example.backend.Ports.Out.VentasOut;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentasService implements VentasIn {

    private final VentasOut ventasOut;

    public VentasService(VentasOut ventasOut) {
        this.ventasOut = ventasOut;
    }

    @Override
    public Ventas crearVenta(Ventas venta) {
        return ventasOut.guardarVenta(venta);
    }

    @Override
    public Optional<Ventas> obtenerVentaPorId(Long id) {
        return ventasOut.buscarVentaPorId(id);
    }

    @Override
    public List<Ventas> listarVentas() {
        return ventasOut.listarVentas();
    }

    @Override
    public Ventas actualizarVenta(Long id, Ventas venta) {
        Optional<Ventas> existente = ventasOut.buscarVentaPorId(id);
        if (existente.isPresent()) {
            venta.setIdVenta(id);
            return ventasOut.actualizarVenta(venta);
        } else {
            throw new RuntimeException("Venta no encontrada con id: " + id);
        }
    }

    @Override
    public void eliminarVenta(Long id) {
        ventasOut.eliminarVenta(id);
    }
}
