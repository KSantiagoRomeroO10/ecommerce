package com.example.backend.Models;

import java.math.BigDecimal;

public class VentaProducto {
  private Long idVentaProducto;
  private Ventas venta;
  private Productos producto;
  private Long cantidad;
  private BigDecimal precioUnitario;

  public VentaProducto(Long idVentaProducto, Ventas venta, Productos producto, Long cantidad,
      BigDecimal precioUnitario) {
    this.idVentaProducto = idVentaProducto;
    this.venta = venta;
    this.producto = producto;
    this.cantidad = cantidad;
    this.precioUnitario = precioUnitario;
  }
  
  public Long getIdVentaProducto() {
    return idVentaProducto;
  }
  public void setIdVentaProducto(Long idVentaProducto) {
    this.idVentaProducto = idVentaProducto;
  }
  public Ventas getVenta() {
    return venta;
  }
  public void setVenta(Ventas venta) {
    this.venta = venta;
  }
  public Productos getProducto() {
    return producto;
  }
  public void setProducto(Productos producto) {
    this.producto = producto;
  }
  public Long getCantidad() {
    return cantidad;
  }
  public void setCantidad(Long cantidad) {
    this.cantidad = cantidad;
  }
  public BigDecimal getPrecioUnitario() {
    return precioUnitario;
  }
  public void setPrecioUnitario(BigDecimal precioUnitario) {
    this.precioUnitario = precioUnitario;
  }

  
}
