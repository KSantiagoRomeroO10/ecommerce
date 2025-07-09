package com.example.backend.Models;

import java.util.List;

public class Vendedores {
  private Integer idVendedor;
  private String nombreVendedor;
  private String correoVendedor;
  private Integer comisionVendedor;
  private List<Ventas> ventas;
  public Vendedores(Integer idVendedor, String nombreVendedor, String correoVendedor, Integer comisionVendedor,
      List<Ventas> ventas) {
    this.idVendedor = idVendedor;
    this.nombreVendedor = nombreVendedor;
    this.correoVendedor = correoVendedor;
    this.comisionVendedor = comisionVendedor;
    this.ventas = ventas;
  }
  public Integer getIdVendedor() {
    return idVendedor;
  }
  public void setIdVendedor(Integer idVendedor) {
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
  public Integer getComisionVendedor() {
    return comisionVendedor;
  }
  public void setComisionVendedor(Integer comisionVendedor) {
    this.comisionVendedor = comisionVendedor;
  }
  public List<Ventas> getVentas() {
    return ventas;
  }
  public void setVentas(List<Ventas> ventas) {
    this.ventas = ventas;
  }
}
