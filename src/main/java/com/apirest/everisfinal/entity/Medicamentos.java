package com.apirest.everisfinal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicamento")
public class Medicamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "descripcion", nullable = false, length = 150)
	private String descripcion;
	
	@Column(name = "contraindicacion", nullable = false, length = 150)
	private String contraIndicacion;
	
	@Column(name = "laboratorio", nullable = false, length = 50)
	private String laboratorio;
	
	@Column(name = "formato", nullable = false, length = 50)
	private String formato;
	
	@Column(name = "precio", nullable = false, length = 50)
	private Double precio;
	
	@Column(name = "cantidad", nullable = false, length = 50)
	private Double cantidad;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getContraindicacion() {
		return contraIndicacion;
	}
	
	public void setContraindicacion(String contraindicacion) {
		this.contraIndicacion = contraindicacion;
	}
	
	public String getLaboratorio() {
		return laboratorio;
	}
	
	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

}
