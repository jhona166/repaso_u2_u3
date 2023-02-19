package com.example.demo.uce.modelo;

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
@Table(name="habitacion")
public class Habitacion {
	///Secuencia////////////
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "habi_sec")
	@SequenceGenerator(name = "habi_sec", sequenceName = "habi_sec", allocationSize = 1)
	@Column(name="habi_id")
	private Integer id;
	@Column(name="habi_numero")
	private String numero;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@ManyToOne()
	@JoinColumn(name="habi_id_hotel")
	private Hotel hotel;
	
	
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	//Set and Get
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
}
