package com.example.demo.modules.zone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ServiceException;
import com.example.demo.modules.zone.converter.ZoneConverter;
import com.example.demo.modules.zone.dto.ZoneDto;
import com.example.demo.modules.zone.entity.Zone;
import com.example.demo.modules.zone.service.ZoneService;

@RestController
@RequestMapping("/zone")
@CrossOrigin(origins="*", allowedHeaders="*")
public class ZoneController 
{
	@Autowired private ZoneService zoneService;
	@Autowired private ZoneConverter zoneConv;
	
	@PostMapping("/addZone")
	public ResponseEntity<Boolean> addZone(@RequestBody ZoneDto zoneDto)
	{
		Zone zone = zoneConv.dtoToEntity(zoneDto);
		boolean op = false;
		try
		{
			op = zoneService.addZone(zone);
			HttpHeaders header = new HttpHeaders();
			header.add("desc", "Adding new zone");
			return ResponseEntity.status(HttpStatus.OK).headers(header).body(op);
		}
		catch(ServiceException e)
		{
			op = false;
			HttpHeaders header = new HttpHeaders();
			header.add("desc", "Adding new zone");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(header).body(op);
		}
	}
}
