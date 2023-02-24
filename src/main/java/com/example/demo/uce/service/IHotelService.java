package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Hotel;

public interface IHotelService {
	public void crear(Hotel hotel);
	public Hotel buscar(Integer id);
	public Hotel buscarLigero(Integer id);
	public void borrar(Integer id);
	public void actualizar(Hotel hotel);
}
