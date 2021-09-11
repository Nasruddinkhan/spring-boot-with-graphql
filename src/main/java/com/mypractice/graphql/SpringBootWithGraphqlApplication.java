package com.mypractice.graphql;

import com.mypractice.graphql.service.impl.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithGraphqlApplication implements CommandLineRunner {
	@Autowired
    private DepartmentService departmentService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWithGraphqlApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		departmentService.findAllDepartments().forEach(System.out::println);
	}
}
