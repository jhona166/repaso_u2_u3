package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.repository.ICiudadanoRepo;
import com.example.demo.uce.repository.IHotelRepo;

@Service
public class HotelServiceImpl implements IHotelService{
	@Autowired 
	private IHotelRepo iHotelRepo;

	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.iHotelRepo.insertar(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscar(id);
	}

	@Override
	public Hotel buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.iHotelRepo.buscarLigero(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHotelRepo.eliminar(id);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		
	}
	
}
