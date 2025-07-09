package com.example.backend.Models;

import java.math.BigDecimal;

public class VentaProducto {
  private Integer idVentaProducto;
  private Ventas venta;
  private Productos producto;
  private Integer cantidad;
  private BigDecimal precioUnitario;

  public VentaProducto(Integer idVentaProducto, Ventas venta, Productos producto, Integer cantidad,
      BigDecimal precioUnitario) {
    this.idVentaProducto = idVentaProducto;
    this.venta = venta;
    this.producto = producto;
    this.cantidad = cantidad;
    this.precioUnitario = precioUnitario;
  }
  
  public Integer getIdVentaProducto() {
    return idVentaProducto;
  }
  public void setIdVentaProducto(Integer idVentaProducto) {
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
  public Integer getCantidad() {
    return cantidad;
  }
  public void setCantidad(Integer cantidad) {
    this.cantidad = cantidad;
  }
  public BigDecimal getPrecioUnitario() {
    return precioUnitario;
  }
  public void setPrecioUnitario(BigDecimal precioUnitario) {
    this.precioUnitario = precioUnitario;
  }
}
