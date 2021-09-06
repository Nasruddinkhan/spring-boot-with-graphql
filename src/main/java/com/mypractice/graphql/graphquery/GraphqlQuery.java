package com.mypractice.graphql.graphquery;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mypractice.graphql.dto.EmployeeDto;
import org.springframework.stereotype.Component;

@Component
public class GraphqlQuery implements GraphQLQueryResolver {
    public String firstNameQuery(){
        return "Nasruddin";
    }

    public String lastNameQuery(){
        return "Khan";
    }

    public String userName(String firstName, String lastName){
        return firstName+ " "+lastName;
    }

    public String getEmployee(EmployeeDto employeeDto){
        return employeeDto.getFirstName()+ " "+employeeDto.getLastName();
    }
}
