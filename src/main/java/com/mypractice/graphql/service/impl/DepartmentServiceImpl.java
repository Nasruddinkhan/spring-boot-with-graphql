package com.mypractice.graphql.service.impl;

import com.mypractice.graphql.dto.DepartmentDto;
import com.mypractice.graphql.mapper.ObjectUtilMapper;
import com.mypractice.graphql.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService{
    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public List<DepartmentDto> findAllDepartments() {
        return ObjectUtilMapper.mapAll(departmentRepository.findAll(), DepartmentDto.class);
    }
}
