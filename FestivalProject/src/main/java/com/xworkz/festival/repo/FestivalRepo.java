package com.xworkz.festival.repo;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.festival.dto.FestivalDto;

public interface FestivalRepo {
	

	public boolean validateAndSave(FestivalDto dto);
	
	public List<FestivalDto> readAll();

	public FestivalDto update(String festivalName, String date, Model model);
	
	
	
	


}
