package com.example.demo.modules.zone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ServiceException;
import com.example.demo.modules.zone.entity.Zone;
import com.example.demo.modules.zone.repository.ZoneRepository;
import com.example.demo.modules.zone.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService
{
	@Autowired private ZoneRepository zoneRepo;
	
	@Override
	public boolean addZone(Zone zone) throws ServiceException 
	{
		boolean op = false;
		try
		{
			zoneRepo.save(zone);
			op = true;
		}
		catch(Exception e)
		{
			throw new ServiceException("Something went wrong while adding zone.",e);
		}
		return op;
	}

}
