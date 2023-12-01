package com.xworkz.hireact.repository;

import com.xworkz.hireact.dto.HireactDTO;

public interface HireactRepository {
	boolean save(HireactDTO dto) throws Exception;

	boolean update(HireactDTO dto, int id);

	boolean readById(int id);

	boolean deleteByName(String name);

	
}
