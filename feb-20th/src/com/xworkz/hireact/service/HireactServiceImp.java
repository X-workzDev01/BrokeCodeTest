/**
 * 
 */
package com.xworkz.hireact.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.hireact.dto.HireactDTO;
import com.xworkz.hireact.repository.HireactRepository;
import com.xworkz.hireact.repository.HireactRepositoryImp;

/**
 * @author Dell
 *
 */
public class HireactServiceImp implements HireactService {
	HireactRepository repo = new HireactRepositoryImp();
	
	
	@Override
	public boolean validateAndSave(HireactDTO dto) throws Exception {
		System.out.println("validate and save method");
		//validation
		
		ValidatorFactory  factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		Set<ConstraintViolation<HireactDTO>>  violation= validator.validate(dto);
		
		if(violation.isEmpty()) {
			boolean save=repo.save(dto);
			System.out.println(save);
		}else {
			System.out.println("Error ");
			System.out.println(violation);
		}
		
		return false;
	}


	@Override
	public boolean update(HireactDTO dto, int id) {
		if(dto!=null) {
			if(id>0) {
			boolean update=	repo.update(dto,id);
			System.out.println(update);
			}
		}
		return false;
	}


	@Override
	public boolean readByID(int id) {
		if(id>0) {
			repo.readById(id);
		}
		return false;
	}
	public boolean deleteByName(String name) {
		repo.deleteByName(name);
		return false;	
	}

}
