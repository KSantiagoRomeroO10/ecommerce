package com.example.backend.Models;

import java.time.LocalDateTime;
import java.util.List;

public class Ventas {
  private Long idVenta;
  private Vendedores vendedor;
  private LocalDateTime fechaVenta = LocalDateTime.now();
  private List<VentaProducto> ventaProductos;

  public Ventas(Long idVenta, Vendedores vendedor, LocalDateTime fechaVenta, List<VentaProducto> ventaProductos) {
    this.idVenta = idVenta;
    this.vendedor = vendedor;
    this.fechaVenta = fechaVenta;
    this.ventaProductos = ventaProductos;
  }
  public Long getIdVenta() {
    return idVenta;
  }
  public void setIdVenta(Long id) {
    this.idVenta = id;
  }
  public Vendedores getVendedor() {
    return vendedor;
  }
  public void setVendedor(Vendedores vendedor) {
    this.vendedor = vendedor;
  }
  public LocalDateTime getFechaVenta() {
    return fechaVenta;
  }
  public void setFechaVenta(LocalDateTime fechaVenta) {
    this.fechaVenta = fechaVenta;
  }
  public List<VentaProducto> getVentaProductos() {
    return ventaProductos;
  }
  public void setVentaProductos(List<VentaProducto> ventaProductos) {
    this.ventaProductos = ventaProductos;
  }
}
