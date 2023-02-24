package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="renta")
public class Renta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_sec")
	@SequenceGenerator(name = "rent_sec", sequenceName = "rent_sec", allocationSize = 1)
	@Column(name="rent_id")
	private Integer id;
	@Column(name="rent_numero_dias")
	private Integer numeroDias;
	@Column(name="rent_fecha_ingreso")
	private LocalDateTime fechaIngreso;
	@Column(name="rent_valor")
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="rent_id_cliente")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="rent_id_vehiculo")
	private Vehiculo vehiculo;
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	@Override
	public String toString() {
		return "Renta [id=" + id + ", numeroDias=" + numeroDias + ", fechaIngreso=" + fechaIngreso + ", valor=" + valor
				+ "]";
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroDias() {
		return numeroDias;
	}
	public void setNumeroDias(Integer numeroDias) {
		this.numeroDias = numeroDias;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
	
	

	
}
