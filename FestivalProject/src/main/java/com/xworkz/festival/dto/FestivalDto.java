package com.xworkz.festival.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FestivalDto {
	
	
	private String festivalName;
	private int noOfDays;
	private String season;
	private String date;
	private String name;
	
	public FestivalDto(String festivalName, int noOfDays, String season, String date) {
		super();
		this.festivalName = festivalName;
		this.noOfDays = noOfDays;
		this.season = season;
		this.date = date;
	}
	
	
	
	

}
