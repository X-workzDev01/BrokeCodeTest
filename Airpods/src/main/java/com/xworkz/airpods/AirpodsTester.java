package com.xworkz.airpods;

import com.xworkz.airpods.dto.AirpodsDto;
import com.xworkz.airpods.service.AirpodsService;
import com.xworkz.airpods.service.AirpodsServiceImpl;

public class AirpodsTester {

	public static void main(String args) {
		
		AirpodsService service = new AirpodsServiceImpl();
		
		AirpodsDto dto = new AirpodsDto(3,"OnePlus", 5000 , "white" , 15);
		
		service.store(dto);
		
		service.updateColorByName("black", "OnePlus");
		
		
		service.deleteByPrice(2100);
		

	}

}
