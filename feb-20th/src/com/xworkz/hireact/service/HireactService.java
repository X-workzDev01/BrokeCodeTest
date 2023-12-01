package com.xworkz.hireact.service;

import com.xworkz.hireact.dto.HireactDTO;

public interface HireactService {
	boolean validateAndSave(HireactDTO dto) throws Exception;
	
	
	boolean update(HireactDTO dto,int id);
	boolean readByID(int id);
	public boolean deleteByName(String name);
}
