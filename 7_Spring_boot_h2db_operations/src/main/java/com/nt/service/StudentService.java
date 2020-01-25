package com.nt.service;

import java.util.List;

import com.nt.model.StudentDetails;

public interface StudentService {
public int saveStudent(StudentDetails std);
public int delete(Integer id);
public int update(StudentDetails std);
StudentDetails getOneStudentdetails(Integer id);
List<StudentDetails>getAllStudentdetails();
}
