package com.mypractice.graphql.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "DEPARTMENTS")
public class Department {
    @Id
    @Column(name = "DEPARTMENT_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEPARTMENTS_SEQ")
    @SequenceGenerator(name = "DEPARTMENTS_SEQ", sequenceName = "DEPARTMENTS_SEQ", allocationSize = 1)
    private Integer departmentId;

    @Column(name = "DEPARTMENT_NAME", length = 30)
    private String departmentName;

}
