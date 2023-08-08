package com.xworkz.election.dto;






import com.xworkz.test.Table;


@Entity
@Table

@NamedQuery(name = "readAll" , query =  "select dto from ElectionDto dto")
public class ElectionDto {
	
	@Id
	private int id;
	private String name;
	private String phoneNumber;
	private String age;
	private String address;
	private String pincode;
	
	
	
	public ElectionDto(String name, String phoneNumber, String age, String address, String pincode) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.address = address;
		this.pincode = pincode;
	}

}
