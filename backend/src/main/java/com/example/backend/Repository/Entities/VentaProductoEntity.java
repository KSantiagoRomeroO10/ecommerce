package com.example.backend.Repository.Entities;

import java.time.LocalDateTime;
import java.util.List;

import com.example.backend.Models.VentaProducto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class VentaProductoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idVenta;

  @ManyToOne
  @JoinColumn(name = "id_vendedor")
  private VendedoresEntity vendedor;

  private LocalDateTime fechaVenta = LocalDateTime.now();

  @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
  private List<VentaProducto> ventaProductos;

  public VentaProductoEntity(Long idVenta, VendedoresEntity vendedor, LocalDateTime fechaVenta,
      List<VentaProducto> ventaProductos) {
    this.idVenta = idVenta;
    this.vendedor = vendedor;
    this.fechaVenta = fechaVenta;
    this.ventaProductos = ventaProductos;
  }

  public Long getIdVenta() {
    return idVenta;
  }

  public void setIdVenta(Long idVenta) {
    this.idVenta = idVenta;
  }

  public VendedoresEntity getVendedor() {
    return vendedor;
  }

  public void setVendedor(VendedoresEntity vendedor) {
    this.vendedor = vendedor;
  }

  public LocalDateTime getFechaVenta() {
    return fechaVenta;
  }

  public void setFechaVenta(LocalDateTime fechaVenta) {
    this.fechaVenta = fechaVenta;
  }

  public List<VentaProducto> getVentaProductos() {
    return ventaProductos;
  }

  public void setVentaProductos(List<VentaProducto> ventaProductos) {
    this.ventaProductos = ventaProductos;
  }

  
}