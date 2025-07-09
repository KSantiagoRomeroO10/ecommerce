package com.example.backend.Repository.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class VentasEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVentaProducto;

  @ManyToOne
  @JoinColumn(name = "id_venta")
  private VentasEntity venta;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private ProductosEntity producto;

  private Long cantidad;

  @Column(precision = 8, scale = 2)
  private BigDecimal precioUnitario;

  public VentasEntity(Long idVentaProducto, VentasEntity venta, ProductosEntity producto, Long cantidad,
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

  public VentasEntity getVenta() {
    return venta;
  }

  public void setVenta(VentasEntity venta) {
    this.venta = venta;
  }

  public ProductosEntity getProducto() {
    return producto;
  }

  public void setProducto(ProductosEntity producto) {
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
