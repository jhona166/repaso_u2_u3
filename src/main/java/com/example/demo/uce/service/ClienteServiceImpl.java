package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService{
	@Autowired
	private IClienteRepo iClienteRepo;
	@Override
	public void crear(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.ingresar(cliente);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscar(id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iClienteRepo.eliminar(id);
	}

	@Override
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iClienteRepo.buscarCedula(cedula);
	}

}
