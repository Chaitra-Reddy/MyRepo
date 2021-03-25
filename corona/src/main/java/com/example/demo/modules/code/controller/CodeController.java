package com.example.demo.modules.code.controller;

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
import com.example.demo.modules.code.entity.Code;
import com.example.demo.modules.code.service.CodeService;

@RestController
@RequestMapping("/code")
@CrossOrigin(origins="*", allowedHeaders="*")
public class CodeController 
{
	@Autowired private CodeService codeService;
	
	@PostMapping("/addCode")
	public ResponseEntity<Boolean> addCode(@RequestBody Code code)
	{
		boolean op = false;
		try
		{
			op = codeService.addCode(code);
			HttpHeaders header = new HttpHeaders();
			header.add("desc", "Adding new color code");
			return ResponseEntity.status(HttpStatus.OK).headers(header).body(op);
		}
		catch(ServiceException e)
		{
			op = false;
			HttpHeaders header = new HttpHeaders();
			header.add("desc", "Adding new color code");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).headers(header).body(op);
		}
	}
}
