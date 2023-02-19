package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
