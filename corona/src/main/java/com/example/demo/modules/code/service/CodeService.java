package com.example.demo.modules.code.service;

import com.example.demo.exception.ServiceException;
import com.example.demo.modules.code.entity.Code;

public interface CodeService 
{
	public boolean addCode(Code code) throws ServiceException;
}
