package com.trantrongnhan.converter;

import org.modelmapper.ModelMapper;

import com.trantrongnhan.DTO.RentAreaDTO;
import com.trantrongnhan.Entity.RentAreaEntity;

public class RentAreaConverter {
	public RentAreaEntity toEntity(RentAreaDTO obj) {
		ModelMapper mapper=new ModelMapper();
		return mapper.map(obj, RentAreaEntity.class);
	}
	public RentAreaDTO toDTO(RentAreaEntity obj) {
		ModelMapper mapper=new ModelMapper();
		return mapper.map(obj,RentAreaDTO.class);
	}
}
