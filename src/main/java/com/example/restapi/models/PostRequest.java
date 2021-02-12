package com.example.restapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PostRequest {
	
	@Id
	@GeneratedValue(strategy=(GenerationType.AUTO))
	Integer id;
	String name;
	String extra;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExtra() {
		return extra;
	}
}
