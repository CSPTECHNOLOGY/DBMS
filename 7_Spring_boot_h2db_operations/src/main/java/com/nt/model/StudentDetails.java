package com.nt.model;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Data
public class StudentDetails {
	private int sid;
	private String snm;
	private String sadd;

}
