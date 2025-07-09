package com.example.backend.Models;

import java.time.LocalDateTime;
import java.util.List;

public class Ventas {
  private Integer idVenta;
  private Vendedores vendedor;
  private LocalDateTime fechaVenta = LocalDateTime.now();
  private List<VentaProducto> ventaProductos;

  public Ventas(Integer idVenta, Vendedores vendedor, LocalDateTime fechaVenta, List<VentaProducto> ventaProductos) {
    this.idVenta = idVenta;
    this.vendedor = vendedor;
    this.fechaVenta = fechaVenta;
    this.ventaProductos = ventaProductos;
  }
  public Integer getIdVenta() {
    return idVenta;
  }
  public void setIdVenta(Integer idVenta) {
    this.idVenta = idVenta;
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
