package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.repository.PassPortRepository;
import com.xworkz.passport.repository.PassPortRepositoryImpl;

public class PassPortServiceImpl implements PassPortService {
	
	
	PassPortRepository repo=new PassPortRepositoryImpl();
	
	@Override
	public boolean validateAndSave(PassportDto dto) {
		if(dto!=null) {
			System.out.println("you can save the Dto");
			repo.onSave(dto);
		}else {
			System.out.println("Dto is null");
		}
		return false;
	}

}
