package com.trantrongnhan.converter;

import org.apache.commons.lang3.StringUtils;
import org.modelmapper.ModelMapper;

import com.trantrongnhan.DTO.BuildingDTO;
import com.trantrongnhan.Entity.BuildingEntity;
import com.trantrongnhan.constant.District;

public class BuildingConverter {
	public BuildingEntity toEntity(BuildingDTO dto) {
		ModelMapper modelMapper=new ModelMapper();
		BuildingEntity result=modelMapper.map(dto, BuildingEntity.class);
		if(dto.getBuildingTypes()!=null && dto.getBuildingTypes().length>0) {
			String type=StringUtils.join(dto.getBuildingTypes(), ",");
			result.setType(type);
		}
		return result;
	}
	public BuildingDTO toDTO(BuildingEntity entity) {
		ModelMapper modelMapper=new ModelMapper();
		BuildingDTO result=modelMapper.map(entity, BuildingDTO.class);
		StringBuilder location=new StringBuilder("");
		if(result.getStreet()!=null) {
			location.append(result.getStreet());
		}
		if(result.getWard()!=null) {
			location.append(" "+result.getWard());
		}
		if(result.getDistrict()!=null && result.getDistrict()!="") {
			location.append(" "+District.valueOf(result.getDistrict()).getDistrict());
		}
		result.setLocation(location.toString());
		return result;
	}
	
}
