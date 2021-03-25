package com.example.demo.modules.zone.converter;

import javax.persistence.Converter;

import org.modelmapper.ModelMapper;

import com.example.demo.modules.zone.dto.ZoneDto;
import com.example.demo.modules.zone.entity.Zone;

@Converter
public class ZoneConverter 
{
	public Zone dtoToEntity(ZoneDto zoneDto)
	{
		ModelMapper mapper = new ModelMapper();
		Zone zone = mapper.map(zoneDto, Zone.class);
		return zone;
	}
	
	public ZoneDto entityToDto(Zone zone)
	{
		ModelMapper mapper = new ModelMapper();
		ZoneDto zoneDto = mapper.map(zone, ZoneDto.class);
		return zoneDto;
	}
}
