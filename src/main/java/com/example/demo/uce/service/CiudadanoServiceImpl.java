package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{
	@Autowired 
	private ICiudadanoRepo iCiudadanoRepo;
	@Override
	public void crear(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.insertar(ciudadano);
	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.buscar(id);
	}

	@Override
	public Ciudadano buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.buscarLigero(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.eliminar(id);;
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.actualizar(ciudadano);
	}

}
