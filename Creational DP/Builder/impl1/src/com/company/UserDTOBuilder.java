package com.company;

import java.time.LocalDate;

/**
 * ABSTRACT BUILDER
 * Interface or Abstract class
 */

public interface UserDTOBuilder {
	//methods to build "parts" of product at a time
	UserDTOBuilder withFirstName(String fname) ;

	UserDTOBuilder withLastName(String lname);

	UserDTOBuilder withBirthday(LocalDate date);

	UserDTOBuilder withAddress(Address address);

	UserDTOBuilder withJob(String job);
	//method to "assemble" final product
	UserDTO build();
	//(optional) method to fetch already built object
	UserDTO getUserDTO();
}

