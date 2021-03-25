package com.example.demo.modules.zone.service;

import com.example.demo.exception.ServiceException;
import com.example.demo.modules.zone.entity.Zone;

public interface ZoneService 
{
	public boolean addZone(Zone zone) throws ServiceException;
}
