package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.Autor;
import com.example.demo.uce.modelo.Libro;
import com.example.demo.uce.service.ILibroService;
import com.example.demo.uce.service.ICiudadanoService;
import com.example.demo.uce.service.IHotelService;

@SpringBootApplication
public class RepasoU2Ja1Application implements CommandLineRunner {
	@Autowired
	private ICiudadanoService iCiudadanoService;
	@Autowired
	private IHotelService iHotelService;
	@Autowired
	private ILibroService iLibroService;
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoU2Ja1Application.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Ciudadano ciud = new Ciudadano();
//		ciud.setNombre("Jhonatan");
//		ciud.setApellido("Altamirano");
//		
//		List<Empleado> empleados = new ArrayList<>();
//		Empleado empl= new Empleado();
//		empl.setSalario(new BigDecimal(500));
//		empl.setFechaIngreso(LocalDateTime.now());
//		empl.setCiudadano(ciud);
//		empleados.add(empl);
//		
//		 
//		Empleado empl2= new Empleado();
//		empl2.setSalario(new BigDecimal(600));
//		empl2.setFechaIngreso(LocalDateTime.now());
//		empl2.setCiudadano(ciud);
//		empleados.add(empl2);
//		ciud.setEmpleados(empleados);
//		this.iCiudadanoService.crear(ciud);
//		System.out.println("Imprime ciudadano y empleados");
//		System.out.println(ciud.getNombre());
//		for (Empleado empleado : empleados) {
//			System.out.println(empleado.getCiudadano());
//		}
//		
//		Hotel hotel =new Hotel();
//		hotel.setNombre("Las palmeras");
//		hotel.setDireccion("Av. La prensa");
//		
//		Hotel hotel1 =new Hotel();
//		hotel1.setNombre("Hilton");
//		hotel1.setDireccion("Av. Patria");
//		
//		List<Habitacion> habitaciones = new ArrayList<Habitacion>();	
//		
//		Habitacion habi = new Habitacion();
//		habi.setNumero("A1");
//		habi.setHotel(hotel);
//		habitaciones.add(habi);
//		
//		Habitacion habi1 = new Habitacion();
//		habi1.setNumero("A2");
//		habi1.setHotel(hotel);
//		habitaciones.add(habi1);
//		
//		Habitacion habi3 = new Habitacion();
//		habi3.setNumero("A3");
//		habi3.setHotel(hotel);
//		habitaciones.add(habi3);
//		
//		hotel.setHabitaciones(habitaciones);
//		
//		this.iHotelService.crear(hotel);
//		this.iHotelService.crear(hotel1);
		//System.out.println("Busqueda de habitaciones: ");
		
		//System.out.println(this.iHotelService.buscar(1));
		
		
		
		
		
		
		//this.iCiudadanoService.buscar(1);
		//System.out.println(this.iCiudadanoService.buscar(1));
		
		
		
	
		

		
		
		Autor autor = new Autor();
		autor.setNombre("Lara");
		
		Autor autor1 = new Autor();
		autor1.setNombre("Panchez");
		
		Autor autor2 = new Autor();
		autor2.setNombre("Calvache");

		List<Autor> autores = new ArrayList<>();
		autores.add(autor);
		autores.add(autor1);
		autores.add(autor2);
		
		
		Libro libro = new Libro();
		libro.setNombre("Analisis Matematico");
		libro.setEditorial("Academia Editores");
		
		
		Libro libro1 = new Libro();
		libro1.setNombre("Fisica Universitaria");
		libro1.setEditorial("Fractal");
		
		Libro libro2 = new Libro();
		libro2.setNombre("Geometria Analitica");
		libro2.setEditorial("Calvache Editores");
		
		//
		List<Libro> libros = new ArrayList<>();
		libros.add(libro);
		libros.add(libro1);
		libros.add(libro2);

		
		autor.setLibros(libros);
		libro.setAutores(autores);
		this.iLibroService.crear(libro);
		this.iLibroService.crear(libro1);
		this.iLibroService.crear(libro2);
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
