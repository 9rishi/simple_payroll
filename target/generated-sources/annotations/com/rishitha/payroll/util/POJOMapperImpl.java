package com.rishitha.payroll.util;

import com.rishitha.payroll.model.Employee;
import com.rishitha.payroll.model.EmployeeDTO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-09T18:01:56+0530",
    comments = "version: 1.5.2.Final, compiler: Eclipse JDT (IDE) 1.4.0.v20210708-0430, environment: Java 16.0.2 (Oracle Corporation)"
)
public class POJOMapperImpl implements POJOMapper {

    @Override
    public Employee employeeDTOToEmployee(EmployeeDTO employeeDTO) {
        if ( employeeDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFistName( employeeDTO.getFName() );
        employee.setLastName( employeeDTO.getLName() );
        employee.setEmpId( employeeDTO.getEmpId() );
        employee.setSalary( employeeDTO.getSalary() );

        return employee;
    }
}
