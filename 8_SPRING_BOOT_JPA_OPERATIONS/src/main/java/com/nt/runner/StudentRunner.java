package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.StudentModel;
import com.nt.repo.Studentrepo;
@Component
public class StudentRunner implements CommandLineRunner {
@Autowired	
private Studentrepo repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());
		//id is null
		//create studentmodel class obj for inser value
		StudentModel sm=new StudentModel(null,"csp","hyd");
		sm=repo.save(sm);
		/*System.out.println(sm.getSid());
		StudentModel sm1=new StudentModel(sm.getSid(), "kuna", "bbsr");
		sm1=repo.save(sm1);
		System.out.println(sm1.getSid());*/

	}

}
