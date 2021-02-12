package com.example.restapi.models;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@GeneratedValue(strategy=(GenerationType.AUTO))
	int id;
	
	@Column(name="message")
	String message;
	
	@Column(name="extra")
	String extra;
	
	public String getExtra() {
		return extra;
	}
	public int getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
