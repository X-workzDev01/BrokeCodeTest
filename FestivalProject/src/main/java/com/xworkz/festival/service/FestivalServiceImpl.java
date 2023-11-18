package com.xworkz.festival.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.xworkz.festival.test.Autowired;
import com.xworkz.festival.dto.FestivalDto;
import com.xworkz.festival.repo.FestivalRepo;



@Service
public class FestivalServiceImpl implements FestivalService{
	
	@Autowired
	private FestivalRepo repo;

	@Override
	public boolean validateAndSave(FestivalDto dto) {
		
		if(dto!=null) {
			if(dto.getFestivalName()!=null && dto.getFestivalName().isEmpty()) {
				if(dto.getDate()!=null && dto.getDate().isEmpty()) {
					
					System.out.println("Data is Valid");
					if(!isExist(dto)) {
						return	repo.validateAndSave(dto);
					}
					return false;
				}
				System.out.println("Date Not valid");
				return false;
			}
			System.out.println("Festival Name  not valid");
			return false;
		}
		System.out.println("Dto not valid");
		return false;
	}

	@Override
	public FestivalDto findByName(String name) {
		if(name!=null && name.isEmpty()) {
			
		List<FestivalDto> data	= repo.readAll();
	
		for (FestivalDto festivalDto : data) {
			if(festivalDto.getFestivalName().equals(name)) {
				System.out.println("Festival Found");
				return festivalDto;
			}
		}
		System.out.println("Festival not found");
		return null;
		
		
		}
		System.out.println("Name not valid");
		return null;
		
		
	}

	@Override
	public List<FestivalDto> getAll() {
	
		return repo.readAll();
	}

	@Override
	public boolean isExist(FestivalDto dto) {
		
	List<FestivalDto> list = repo.readAll();
	
	for(FestivalDto fdto : list) {
		if(fdto.getFestivalName().equals(dto.getFestivalName()) && fdto.getSeason().equals(dto.getSeason())) {
			System.out.println("Dto Exist");
			return true;
		}
	}
	System.out.println("Dto not Exist");
	return true;
	}

	@Override
	public FestivalDto update(String festivalName, String date , Model model) {
		if(festivalName!=null && festivalName.isEmpty() ) {
			if(date!=null && !date.isEmpty()) {
			FestivalDto dto = repo.update(festivalName, date , model);
			return dto;
			}
			System.out.println("Date Not valid");
			model.addAttribute("dateNotValid" , "Date is Not valid");
			return null;
		}
		model.addAttribute("nameNotValid" , "Festival Name is Not valid");
		System.out.println("Festival Name not valid");
		return null;
	}

}
