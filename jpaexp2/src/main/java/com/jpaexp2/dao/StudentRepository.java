package com.jpaexp2.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpaexp2.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer> {

}
