package com.rishitha.payroll.util;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.rishitha.payroll.model.Employee;
import com.rishitha.payroll.model.EmployeeDTO;

@Mapper

public interface POJOMapper  {

	POJOMapper INSTANCE = Mappers.getMapper(POJOMapper.class);

	@Mapping(target = "fistName", source = "FName")

	@Mapping(target = "lastName", source = "LName")
	Employee employeeDTOToEmployee(EmployeeDTO employeeDTO);

}
