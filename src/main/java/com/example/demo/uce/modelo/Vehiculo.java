package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehi_sec")
	@SequenceGenerator(name = "vehi_sec", sequenceName = "vehi_sec", allocationSize = 1)
	@Column(name="vehi_id")
	private Integer id;
	@Column(name="vehi_placa")
	private String placa;
	@Column(name="vehi_color")
	private String color;
	@Column(name="vehi_modelo")
	private String modelo;
	
	
	@OneToMany(mappedBy = "vehiculo")
	private List<Renta> rentas;
	
	
	
	public List<Renta> getCliente() {
		return rentas;
	}
	public void setCliente(List<Renta> rentas) {
		this.rentas = rentas;
	}
	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ", placa=" + placa + ", color=" + color + ", modelo=" + modelo + "]";
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
}
