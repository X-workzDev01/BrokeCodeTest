package com.xworkz.airpods.dto;





import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;


import com.xworkz.airpods.test.Id;

import lombok.AllArgsConstructor;
import lombok.Data;





@Data
@Table
@AllArgsConstructor
@NamedQuery(name = "deleteByPrice" , query = "Delete from AirpodsDto dto where dto.price=pr")
@NamedQuery(name = "updateColorbyName", query = "Update AirpodsDto dto set dto.color=:col where dto.brandName=nm")
public class AirpodsDto {
	
	@Id
	private int id;
	private String brandName;
	private int price;
	private String color;
	private int batteryBackup;
	


}
