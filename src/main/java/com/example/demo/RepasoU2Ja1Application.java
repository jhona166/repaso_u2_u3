package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Cliente;
import com.example.demo.uce.modelo.Vehiculo;
import com.example.demo.uce.service.IClienteService;
import com.example.demo.uce.service.IRentaService;
import com.example.demo.uce.service.IVehiculoService;



@SpringBootApplication
public class RepasoU2Ja1Application implements CommandLineRunner{
	@Autowired
	private IClienteService iClienteService;
	@Autowired
	private IVehiculoService iVehiculoService;
	@Autowired
	private IRentaService iRentaService; 
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoU2Ja1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Cliente clie = new Cliente();
		clie.setNombre("Juan");
		clie.setApellido("Arias");
		clie.setCedula("1727501510");
		clie.setEdad(23);
		this.iClienteService.crear(clie);
		
		Vehiculo vehi = new Vehiculo();
		vehi.setColor("Plateado");
		vehi.setModelo("Aveo");
		vehi.setPlaca("PCO123");
		this.iVehiculoService.crear(vehi);
		
		this.iRentaService.crear(clie.getCedula(), vehi.getPlaca());
	
	}

	

}
