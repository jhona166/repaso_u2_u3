package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Renta;

public interface IRentaRepo {
	public void ingresar(Renta renta);
	public void actualizar(Renta renta);
	public Renta buscar(Integer id);
	public void eliminar(Integer id);

}
