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
  private Integer idVentaProducto;

  @ManyToOne
  @JoinColumn(name = "id_venta")
  private VentasEntity venta;

  @ManyToOne
  @JoinColumn(name = "id_producto")
  private ProductosEntity producto;

  private Integer cantidad;

  @Column(precision = 8, scale = 2)
  private BigDecimal precioUnitario;

  public VentasEntity(Integer idVentaProducto, VentasEntity venta, ProductosEntity producto, Integer cantidad,
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
