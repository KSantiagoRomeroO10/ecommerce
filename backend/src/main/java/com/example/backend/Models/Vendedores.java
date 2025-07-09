package com.example.backend.Models;

import java.util.List;

public class Vendedores {
  private Long idVendedor;
  private String nombreVendedor;
  private String correoVendedor;
  private Long comisionVendedor;
  private List<Ventas> ventas;
  
  public Vendedores(Long idVendedor, String nombreVendedor, String correoVendedor, Long comisionVendedor,
      List<Ventas> ventas) {
    this.idVendedor = idVendedor;
    this.nombreVendedor = nombreVendedor;
    this.correoVendedor = correoVendedor;
    this.comisionVendedor = comisionVendedor;
    this.ventas = ventas;
  }
  public Long getIdVendedor() {
    return idVendedor;
  }
  public void setIdVendedor(Long idVendedor) {
    this.idVendedor = idVendedor;
  }
  public String getNombreVendedor() {
    return nombreVendedor;
  }
  public void setNombreVendedor(String nombreVendedor) {
    this.nombreVendedor = nombreVendedor;
  }
  public String getCorreoVendedor() {
    return correoVendedor;
  }
  public void setCorreoVendedor(String correoVendedor) {
    this.correoVendedor = correoVendedor;
  }
  public Long getComisionVendedor() {
    return comisionVendedor;
  }
  public void setComisionVendedor(Long comisionVendedor) {
    this.comisionVendedor = comisionVendedor;
  }
  public List<Ventas> getVentas() {
    return ventas;
  }
  public void setVentas(List<Ventas> ventas) {
    this.ventas = ventas;
  }
}
