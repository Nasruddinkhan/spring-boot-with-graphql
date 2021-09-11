package com.mypractice.graphql.service.impl;

import com.mypractice.graphql.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentDto> findAllDepartments();

}
