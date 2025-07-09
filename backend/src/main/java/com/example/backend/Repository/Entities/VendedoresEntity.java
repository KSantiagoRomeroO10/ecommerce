package com.example.backend.Repository.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class VendedoresEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVendedor;

  private String nombreVendedor;
  private String correoVendedor;
  private Long comisionVendedor;

  @OneToMany(mappedBy = "vendedor", cascade = CascadeType.ALL)
  private List<VentasEntity> ventas;

  public VendedoresEntity(Long idVendedor, String nombreVendedor, String correoVendedor, Long comisionVendedor,
      List<VentasEntity> ventas) {
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

  public List<VentasEntity> getVentas() {
    return ventas;
  }

  public void setVentas(List<VentasEntity> ventas) {
    this.ventas = ventas;
  }

  
}
