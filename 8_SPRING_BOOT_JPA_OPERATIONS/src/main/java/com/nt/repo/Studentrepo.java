package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.StudentModel;

public interface Studentrepo extends JpaRepository<StudentModel, Integer> {

}
