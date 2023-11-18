package com.xworkz.festival.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.xworkz.festival.test.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.festival.dto.FestivalDto;
import com.xworkz.festival.service.FestivalService;

@Controller
@RequestMapping("/fest")
public class FestivalController {
	
	@Autowired
	private FestivalService service;
	
	
	@RequestMapping(value = "/save" , method = RequestMethod.POST)
	public String save(FestivalDto dto , Model model) {
		
	boolean result = service.validateAndSave(dto);
	
	if(!result) {
		model.addAttribute("saved" , "Data Saved Successfully");
		return "New";
	}
	else {
		model.addAttribute("saved" , "Data not Saved Successfully");
		return "Festival";
	}
	
	

	}
	
	
	@RequestMapping(value = "find" , method = RequestMethod.GET)
	public String findByFestivalName(@RequestParam String festivalName , Model model) {
		
		FestivalDto dto = service.findByName(festivalName);
		
		if(dto!=null) {
			model.addAttribute("festival" , dto);
			return "Find";
			
		}
		else {
			model.addAttribute("message", "Festival Not found");
			return "Find";
		}
		
	}
	
									
	@RequestMapping(value = "/getAll" , method = RequestMethod.GET)
	public String getAll(Model model) {
	List<FestivalDto> list = service.getAll();
	
	if(list!=null) {
		
	
		model.addAttribute("data", list);
		return "Read";
	}
	else {
		model.addAttribute("readMessage", "No Data Found");
		return "Find";
	}
	}
	
	
	@RequestMapping(value = "/update" , method = RequestMethod.PUT)
	public String updateDateByName(String festivalName ,  String date , Model model) {
		FestivalDto dto = service.update(festivalName, date , model);
		if(dto!=null) {
			model.addAttribute("updateMessage" , "Date Updated");
			model.addAttribute("updateDto" , dto);
			return "update";
		}
		else {
			model.addAttribute("updateMessage" , "Date Not Updated");
			
		}
		
		return "update";
	}
	
	
	

}
