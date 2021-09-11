package com.mypractice.graphql.controller;

import com.mypractice.graphql.dto.EmployeeDto;
import com.mypractice.graphql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee/all")
    public ResponseEntity<List<EmployeeDto>> findAllEmployees(){
        return new ResponseEntity<>(employeeService.findAllEmployee(), HttpStatus.OK);
    }
}
