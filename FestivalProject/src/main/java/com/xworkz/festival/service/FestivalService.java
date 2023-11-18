package com.xworkz.festival.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.festival.dto.FestivalDto;

public interface FestivalService {
	
	public boolean validateAndSave(FestivalDto dto);
	
	public FestivalDto findByName(String name);

	public List<FestivalDto> getAll();
	
	public boolean isExist(FestivalDto dto);
	
	public FestivalDto update(String festivalName , String date , Model model);

}
