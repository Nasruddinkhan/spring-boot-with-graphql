package com.mypractice.graphql.service;

import com.mypractice.graphql.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> findAllEmployee();
    EmployeeDto findById(Integer employeeId);
}
