package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Hotel;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class HotelRepoImpl implements IHotelRepo{
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public Hotel buscar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hote = this.entityManager.find(Hotel.class, id);
		hote.getHabitaciones().size();
		return hote;
	}

	@Override
	public Hotel buscarLigero(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Hotel hote = this.buscar(id);
		this.entityManager.remove(hote);
	}

	@Override
	public void actualizar(Hotel ciudadano) {
		// TODO Auto-generated method stub
		
	}

}
