package com.example.demo.modules.zone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.modules.code.entity.Code;

@Entity
public class Zone 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int zoneId;
	
	private String name;
	private int population;
	
	@OneToOne
	@JoinColumn(name="code_color")
	private Code code;
	
	public int getZoneId() {
		return zoneId;
	}
	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}
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
