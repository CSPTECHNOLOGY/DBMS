package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.StudentDetails;
import com.nt.service.StudentServiceImpl;

@Component
public class Jdbctestrunner implements CommandLineRunner {
	@Autowired
	private StudentServiceImpl service;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		StudentDetails s1 = new StudentDetails();
		s1.setSid(101);
		s1.setSnm("cspratap");
		s1.setSadd("hyd");
		service.update(s1);
		

	}

}
