package com.xworkz.passport.repository;

import com.xworkz.passport.dto.PassportDto;

public interface PassPortRepository {

	boolean onSave(PassportDto dto);

}
