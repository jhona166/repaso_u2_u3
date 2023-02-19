package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Ciudadano;
import com.example.demo.uce.modelo.Estudiante;
import com.example.demo.uce.service.ICiudadanoService;

@SpringBootApplication
public class RepasoU2JaApplication implements CommandLineRunner{
	@Autowired
	private ICiudadanoService iCiudadanoService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Ciudadano ciu = new Ciudadano();
		ciu.setApellido("Ortiz");
		ciu.setNombre("Danilo");		
		
		
		Estudiante estu = new Estudiante();
		estu.setNombre("Jhonatan");
		estu.setApellido("Altamirano");
		estu.setCedula("1727501510");
		estu.setGenero("M");
		estu.setCiudad("Quito");
		ciu.setEstudiante(estu);
		this.iCiudadanoService.crear(ciu);
	}

}
