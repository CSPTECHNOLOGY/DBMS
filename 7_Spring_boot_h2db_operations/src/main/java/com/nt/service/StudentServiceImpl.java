package com.nt.service;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.nt.model.StudentDetails;
@Service
public class StudentServiceImpl implements StudentService {
//using jdbc template
	private JdbcTemplate jt;
	
	
	
	//form data retrive
	public int saveStudent(StudentDetails std) {
	String sql="insert into StudentTable values(?,?,?)";
			int count=jt.update(sql,std.getSid(),std.getSnm(),std.getSadd());
			return count;
		
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(StudentDetails std) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public StudentDetails getOneStudentdetails(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentDetails> getAllStudentdetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
