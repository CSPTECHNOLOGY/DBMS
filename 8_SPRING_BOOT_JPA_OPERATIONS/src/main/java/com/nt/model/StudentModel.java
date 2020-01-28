package com.nt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity//mapping with table
public class StudentModel {
	@Id
	@GeneratedValue//only for save operation not for insert and delete
	private Integer sid;
	private String snm;
	private String sadd;
	public StudentModel(){
		
	}
	public StudentModel(Integer sid, String snm, String sadd) {
		
		this.sid = sid;
		this.snm = snm;
		this.sadd = sadd;
	}
	

}
