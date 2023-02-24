package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Ciudadano;

public interface ICiudadanoService {
	public void crear(Ciudadano ciudadano);
	public Ciudadano buscar(Integer id);
	public Ciudadano buscarLigero(Integer id);
	public void borrar(Integer id);
	public void actualizar(Ciudadano ciudadano);
}
