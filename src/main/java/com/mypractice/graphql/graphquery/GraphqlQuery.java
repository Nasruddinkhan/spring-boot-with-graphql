package com.mypractice.graphql.graphquery;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mypractice.graphql.dto.DepartmentDto;
import com.mypractice.graphql.dto.EmployeeDto;
import com.mypractice.graphql.service.EmployeeService;
import com.mypractice.graphql.service.impl.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GraphqlQuery implements GraphQLQueryResolver {

    private final EmployeeService employeeService;
    private final DepartmentService departmentService;
    @Autowired
    public GraphqlQuery(EmployeeService employeeService, DepartmentService departmentService) {
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    public String firstNameQuery(){
        return "Nasruddin";
    }

    public String lastNameQuery(){
        return "Khan";
    }

    public String userName(String firstName, String lastName){
        return firstName+ " "+lastName;
    }


    public EmployeeDto getEmployeeById(Integer employeeId){
        System.out.println("GraphqlQuery.getEmployeeById ["+employeeId+"]");
        return employeeService.findById(employeeId);
    }

    public List<DepartmentDto> getDepartments(){
        System.out.println("GraphqlQuery.getDepartments");
        return departmentService.findAllDepartments();
    }

    public List<EmployeeDto> findAllEmployees(){
        System.out.println("GraphqlQuery.findAllEmployees");
        return employeeService.findAllEmployee();
    }
}
