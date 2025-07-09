package com.example.backend.Repository.Entities;

import java.math.BigDecimal;
import java.util.List;

import com.example.backend.Models.VentaProducto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class ProductosEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer idProducto;

  private String nombreProducto;

  @Column(precision = 8, scale = 2)
  private BigDecimal precioProducto;

  @Column(columnDefinition = "TEXT")
  private String descripcionProducto;

  private Integer stockProducto;

  @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
  private List<VentaProducto> ventaProductos;

  public ProductosEntity(Integer idProducto, String nombreProducto, BigDecimal precioProducto,
      String descripcionProducto, Integer stockProducto, List<VentaProducto> ventaProductos) {
    this.idProducto = idProducto;
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;
    this.descripcionProducto = descripcionProducto;
    this.stockProducto = stockProducto;
    this.ventaProductos = ventaProductos;
  }

  public Integer getIdProducto() {
    return idProducto;
  }

  public void setIdProducto(Integer idProducto) {
    this.idProducto = idProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public BigDecimal getPrecioProducto() {
    return precioProducto;
  }

  public void setPrecioProducto(BigDecimal precioProducto) {
    this.precioProducto = precioProducto;
  }

  public String getDescripcionProducto() {
    return descripcionProducto;
  }

  public void setDescripcionProducto(String descripcionProducto) {
    this.descripcionProducto = descripcionProducto;
  }

  public Integer getStockProducto() {
    return stockProducto;
  }

  public void setStockProducto(Integer stockProducto) {
    this.stockProducto = stockProducto;
  }

  public List<VentaProducto> getVentaProductos() {
    return ventaProductos;
  }

  public void setVentaProductos(List<VentaProducto> ventaProductos) {
    this.ventaProductos = ventaProductos;
  }

  
}
