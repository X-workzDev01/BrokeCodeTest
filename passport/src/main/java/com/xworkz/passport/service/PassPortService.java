package com.xworkz.passport.service;

import com.xworkz.passport.dto.PassportDto;

public interface PassPortService {
	
  boolean validateAndSave(PassportDto dto);

}
