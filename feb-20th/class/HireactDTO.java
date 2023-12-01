package com.xworkz.hireact.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class HireactDTO {
	private int id;
	@NotBlank(message="Name must not be Blank")
	@Size(min=3,max=15)
	@NotEmpty
	@NotBlank
	@Email
	private String name;
	@NotBlank
	@NotEmpty
	private String qualification;
	@NotBlank
	@NotEmpty
	private String skills;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
}
