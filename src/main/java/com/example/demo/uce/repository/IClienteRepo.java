package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Cliente;

public interface IClienteRepo {
	public void ingresar(Cliente cliente);
	public void actualizar(Cliente cliente);
	public Cliente buscar(Integer id);
	public void eliminar(Integer id);
	public Cliente buscarCedula(String cedula);
	
}
