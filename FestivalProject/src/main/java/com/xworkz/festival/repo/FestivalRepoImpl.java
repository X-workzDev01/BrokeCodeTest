package com.xworkz.festival.repo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.xworkz.festival.dto.FestivalDto;

@Component
public class FestivalRepoImpl implements FestivalRepo {
	
	
	private List<FestivalDto> database = new ArrayList<FestivalDto>();
	
	public FestivalRepoImpl() {
		addData();
	}
	

	@Override
	public boolean validateAndSave(FestivalDto dto) {	
		boolean saved =	database.add(dto);	
		return saved;
	}
	
	public void addData() {
		
	FestivalDto festival1 =	new FestivalDto("Deepawali", 3, "Winter", "NOV");
	FestivalDto festival2 =	new FestivalDto("Christmas", 2, "Winter", "DEC");
	
	FestivalDto festival3 =	new FestivalDto("Dussehra", 5, "Rainy", "OCT");
	FestivalDto festival4 =	new FestivalDto("Ramzan", 30, "Rainy", "JUN");
	FestivalDto festival5 =	new FestivalDto("Sankranti", 3, "Winter", "JAN");
	FestivalDto festival6 =	new FestivalDto("Ugadhi", 4, "Summer", "MAR");
		
	
	}

	@Override
	public List<FestivalDto> readAll() {
		return database;
	}

	@Override
	public FestivalDto update(String name, String date , Model model) {
		for (FestivalDto festivalDto : database) {
			if(festivalDto.getName().equals(name)) {
				festivalDto.setDate(date);
				return festivalDto;
			}
		}
		model.addAttribute("notFound", "Festival Name not found");
		System.out.println("Festival Name not found");
		return null;
	}
	
	
	
	
	
	
	
	
	
	

}
