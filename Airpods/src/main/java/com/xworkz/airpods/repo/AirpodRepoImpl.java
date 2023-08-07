package com.xworkz.airpods.repo;



import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.airpods.dto.AirpodsDto;

public class AirpodRepoImpl implements AirpodsRepo {
	AirpodsDto dto = new AirpodsDto(0, null, 0, null, 0);
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("data_connection");
	EntityManager em = emf.createEntityManager();
	
	
	
	public boolean store(AirpodsDto dto1) {
		
		
		if(em!=null) {

			em.getTransaction().begin();
			em.persist(dto);
			em.close();
			return true;
		}
		
		return false;
	}



	public boolean updateColorByName(String color, String name) {
		if(em!=null) {
			em.getTransaction().begin();
		Query query = em.createNamedQuery("updateColorbyName");
		
		query.setParameter("color", color);
		query.setParameter("name", name);
		query.executeUpdate();
		return true;
		
		}
		return false;
	}



	public boolean deleteByPrice(int price) {
		if(em==null) {
			em.getTransaction().begin();
			Query query = em.createNamedQuery("deleteByPrice");
			query.setParameter("pr", price);
			em.getTransaction().commit();
			return true;
			
		}
		return false;
	}



	public AirpodsDto readAll() {
		em.getTransaction().begin();
		Query query = em.createNamedQuery("readAll");
		List list =  query.getResultList();
		return null;
	}
	
	

}
