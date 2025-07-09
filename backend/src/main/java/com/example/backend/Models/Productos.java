package com.example.backend.Models;

import java.math.BigDecimal;

public class Productos {
  private Long idProducto;
  private String nombreProducto;
  private BigDecimal precioPrducto;
  private String descripcionProducto;
  private Long stockProducto;
  
  public Productos(Long idProducto, String nombreProducto, BigDecimal precioPrducto, String descripcionProducto,
      Long stockProducto) {
    this.idProducto = idProducto;
    this.nombreProducto = nombreProducto;
    this.precioPrducto = precioPrducto;
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

  public BigDecimal getPrecioPrducto() {
    return precioPrducto;
  }

  public void setPrecioPrducto(BigDecimal precioPrducto) {
    this.precioPrducto = precioPrducto;
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
