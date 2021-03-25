package com.example.demo.modules.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ServiceException;
import com.example.demo.exception.code.DuplicateDataEntryException;
import com.example.demo.modules.code.entity.Code;
import com.example.demo.modules.code.repository.CodeRepository;
import com.example.demo.modules.code.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService
{
	@Autowired private CodeRepository codeRepo;

	@Override
	public boolean addCode(Code code) throws ServiceException 
	{
		boolean op = false;
		try
		{
			Code code1 = codeRepo.findById(code.getColor()).orElse(null);
			if(code1 == null)
			{
				codeRepo.save(code);
				op = true;
			}
			else
			{
				throw new DuplicateDataEntryException("Color already exists.");
			}
		}
		catch(Exception e)
		{
			throw new ServiceException("Something went wrong while adding data.",e);
		}
		return op;
	}

}
