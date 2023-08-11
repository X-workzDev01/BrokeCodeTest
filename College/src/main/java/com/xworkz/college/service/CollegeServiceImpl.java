package com.xworkz.college.service;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repo.CollegeRepo;
import com.xworkz.college.repo.CollegeRepoImpl;

public class CollegeServiceImpl implements CollegeService {
	
	
	CollegeRepoImpl repo = new CollegeRepoImpl();

	@Override
	public String save(CollegeDto dto) {
		if(dto.getName().length()<2) {
			//validate for all the fields
			System.out.println("save method from service");
			return repo.save(dto);
		}else {
			return "Name is not valid";
		}
		
	}

	@Override
	public List<CollegeDto> readAll() {
		
		return repo.readAll();
	}

}
