package com.xworkz.hireact.runner;

import com.xworkz.hireact.dto.HireactDTO;
import com.xworkz.hireact.service.HireactService;
import com.xworkz.hireact.service.HireactServiceImp;

public class HireactRunner {

	public static void main(String... args) throws Exception{
		HireactDTO dto = new HireactDTO();
		dto.setId(5);
		dto.setName("abc");
		dto.setQualification("BCA");
		dto.setSkills("HTML");
		dto.setEmail("nikkigmail.com");
		
		HireactService service = new HireactServiceImp();
		service.validateAndSave(dto);
		service.update(dto, 2);
		service.readByID(2);
		service.deleteByName("Maha");
	}

}
