package com.example.demo.modules.zone.dto;

import com.example.demo.modules.code.entity.Code;

public class ZoneDto 
{
	private String name;
	private int population;
	private Code code;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public Code getCode() {
		return code;
	}
	public void setCode(Code code) {
		this.code = code;
	}
}
