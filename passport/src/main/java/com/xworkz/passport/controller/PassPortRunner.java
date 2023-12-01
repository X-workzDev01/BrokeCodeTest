package com.xworkz.passport.controller;

import java.util.Date;

import com.xworkz.passport.dto.PassportDto;
import com.xworkz.passport.service.PassPortService;
import com.xworkz.passport.service.PassPortServiceImpl;

public class PassPortRunner {
	
	public static void main(String... args) {
		
		PassportDto dto = new PassportDto("Darshan","darshan@gmail.com",972947254l, "darshan@1", new Date(), "darshan@1", "bangalore", "G78HD9", 625144469078l);
		System.out.println(dto.toString());
		PassPortService service = new PassPortServiceImpl();
		service.validateAndSave(dto);
	}

}
