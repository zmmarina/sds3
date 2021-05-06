package com.devsuperior.zm.entities;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
	
	private Long id;
	private String name;
	
	private List<Class> classes = new ArrayList<>();
	
	public Instructor() {
		
	}


	public Instructor(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Class> getClasses() {
		return classes;
	}
	
	
	

}
