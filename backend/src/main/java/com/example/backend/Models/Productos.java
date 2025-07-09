package com.example.backend.Models;

import java.math.BigDecimal;

public class Productos {
  private Long idProducto;
  private String nombreProducto;
  private BigDecimal precioProducto;
  private String descripcionProducto;
  private Long stockProducto;

  public Productos(Long idProducto, String nombreProducto, BigDecimal precioProducto, String descripcionProducto,
      Long stockProducto) {
    this.idProducto = idProducto;
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;
    this.descripcionProducto = descripcionProducto;
    this.stockProducto = stockProducto;
  }

  public Long getIdProducto() {
    return idProducto;
  }
  public void setIdProducto(Long idProducto) {
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
  public Long getStockProducto() {
    return stockProducto;
  }
  public void setStockProducto(Long stockProducto) {
    this.stockProducto = stockProducto;
  }
  
}
