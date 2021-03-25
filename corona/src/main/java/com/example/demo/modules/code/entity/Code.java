package com.example.demo.modules.code.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Code 
{
	@Id
	private String color;
	private String meaning;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
}
