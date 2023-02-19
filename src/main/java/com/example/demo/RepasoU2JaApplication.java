package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Habitacion;
import com.example.demo.uce.modelo.Hotel;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class RepasoU2JaApplication implements CommandLineRunner{
	@Autowired
	private ICiudadanoService iCiudadanoService;
	@Autowired
	private IHotelService iHotelService;
	public static void main(String[] args) {
		SpringApplication.run(RepasoU2JaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Ciudadano ciu = new Ciudadano();
//		ciu.setApellido("Ortiz");
//		ciu.setNombre("Danilo");		
//		
//		
//		Estudiante estu = new Estudiante();
//		estu.setNombre("Jhonatan");
//		estu.setApellido("Altamirano");
//		estu.setCedula("1727501510");
//		estu.setGenero("M");
//		estu.setCiudad("Quito");
//		ciu.setEstudiante(estu);
//		this.iCiudadanoService.crear(ciu);
		
		Hotel hotel = new Hotel();
		hotel.setNombre("Hilton");
		hotel.setDirreccion("Av. Patria");
		
		List<Habitacion> habitaciones =new ArrayList<>();
		Habitacion habi= new Habitacion();
		habi.setNumero("A1");
		habi.setHotel(hotel);
		habitaciones.add(habi);
		
		Habitacion habi1= new Habitacion();
		habi1.setNumero("A2");
		habi1.setHotel(hotel);
		habitaciones.add(habi1);
		
		hotel.setHabitaciones(habitaciones);
		this.iHotelService.crear(hotel);
	}

}
