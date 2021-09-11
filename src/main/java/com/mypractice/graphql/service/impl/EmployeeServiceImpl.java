package com.mypractice.graphql.service.impl;

import com.mypractice.graphql.dto.EmployeeDto;
import com.mypractice.graphql.mapper.ObjectUtilMapper;
import com.mypractice.graphql.repository.EmployeeRepository;
import com.mypractice.graphql.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeDto> findAllEmployee() {
       return ObjectUtilMapper.mapAll(employeeRepository.findAll(), EmployeeDto.class);
    }

    @Override
    public EmployeeDto findById(Integer employeeId) {
        return  ObjectUtilMapper.map(employeeRepository.findById(employeeId)
                        .orElseThrow(()->new RuntimeException("record not found"))
                , EmployeeDto.class);
    }
}
