package com.example.demo.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Renta;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.repository.IClienteRepo;
import com.example.demo.uce.repository.IRentaRepo;
import com.example.demo.uce.repository.IVehiculoRepo;

@Service
public class RentaServiceImpl implements IRentaService{
	@Autowired
	private IRentaRepo iRentaRepo;
	@Autowired
	private IVehiculoRepo iVehiculoRepo;
	@Autowired
	private IClienteRepo iClienteRepo;
	
	
	@Override
	public void crear(String cedula, String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehi = this.iVehiculoRepo.buscarPlaca(placa);
		Cliente clie = this.iClienteRepo.buscarCedula(cedula);
	
		Renta renta = new Renta();
		renta.setCliente(clie);
		renta.setVehiculo(vehi);
		renta.setFechaIngreso(LocalDateTime.now());
		renta.setNumeroDias(15);
		renta.setValor(new BigDecimal(500));
		BigDecimal nDias =BigDecimal.valueOf(renta.getNumeroDias());
		BigDecimal valor=nDias.multiply(renta.getValor());
		renta.setValor(valor); 
		
		List<Renta> rentas = new ArrayList<>();
		rentas.add(renta);
		
		this.iRentaRepo.ingresar(renta);
		
		vehi.setCliente(rentas);
		clie.setVehiculo(rentas);
		
		this.iClienteRepo.actualizar(clie);
		this.iVehiculoRepo.actualizar(vehi);
		
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
