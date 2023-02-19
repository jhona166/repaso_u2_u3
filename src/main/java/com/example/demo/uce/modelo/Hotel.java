package com.example.demo.uce.modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_sec")
	@SequenceGenerator(name = "hotel_sec", sequenceName = "hotel_sec", allocationSize = 1)
	@Column(name="hotel_id")
	private Integer id;
	@Column(name="hotel_nombre")
	private String nombre;
	@Column(name="hotel_direccion")
	private String dirreccion;
	
	@OneToMany(mappedBy="hotel",cascade=CascadeType.ALL)
	private List<Habitacion> habitaciones;
	
	
	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nombre=" + nombre + ", dirreccion=" + dirreccion + "]";
	}
	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDirreccion() {
		return dirreccion;
	}
	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}
	
	public List<Habitacion> getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}
}
