package com.nt.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.model.StudentModel;
import com.nt.repo.Studentrepo;

@Component
public class Studentrunner1 implements CommandLineRunner {
	@Autowired
	private Studentrepo repo1;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("********save/update*********");
		StudentModel m1 = new StudentModel(101, "raja", "hyd");
		m1 = repo1.save(m1);
		System.out.println(m1.getSid());
		// m2 upadte based on m1_id value
		System.out.println("*******id exist ****update********");
		StudentModel m2 = new StudentModel(m1.getSid(), "kuna", "bbsr");
		m2 = repo1.save(m2);
		System.out.println(m2.getSid());
		repo1.save(new StudentModel(101, "rohit", "ctc"));
		repo1.save(new StudentModel(102, "suva", "jjpr"));
		System.out.println(repo1.count());// 4 data
		System.out.println("***********select*************");
		// fetch all row and print
		repo1.findAll().forEach(System.out::println);
		// fetch one row by id(pk)
		/*
		 * Optional<T>is a class in java8 used to avoid N.P.E by giving validation
		 * method like [isPresent()] ,[ifpresent].[ifpresentonelse]
		 */
		Optional<StudentModel> m3 = repo1.findById(m2.getSid());
		if (m3.isPresent()) {
			// avoid npe
			System.out.println(m3.get());// actual obj

		} else {
			System.out.println("no data found");
		}
		System.out.println("************delete**********");
		repo1.deleteById(2);

	}

}
