package com.xworkz.college.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.college.dto.CollegeDto;

public class CollegeRepoImpl implements CollegeRepo {
	
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("data-connection");
	private EntityManager em = emf.createEntityManager();
	
	@Override
	public String save(CollegeDto dto) {
			System.out.println("save method from Repo");
			em=null;
			em.persist(dto);
			
			em.getTransaction().commit();
			return "data saved successfully";
	}

	@Override
	public List<CollegeDto> readAll() {
			Query query = em.createNamedQuery("readAll");
			List<CollegeDto> data = query.getResultList();
			em.getTransaction().commit();
			return data;
	}

}
