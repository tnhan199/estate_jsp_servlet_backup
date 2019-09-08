package com.trantrongnhan.service.impl;

import com.trantrongnhan.DTO.RentAreaDTO;
import com.trantrongnhan.Reponsitory.IRentAreaReponsitory;
import com.trantrongnhan.Reponsitory.impl.RentAreaReponsitory;
import com.trantrongnhan.converter.RentAreaConverter;
import com.trantrongnhan.service.IRentAreaService;

public class RentAreaService implements IRentAreaService {
	private IRentAreaReponsitory rentAreaReponsitory=new RentAreaReponsitory();
	private RentAreaConverter rentAreaConverter=new RentAreaConverter();
	@Override
	public Integer insert(RentAreaDTO rentAreaDTO) {
		return rentAreaReponsitory.save(rentAreaConverter.toEntity(rentAreaDTO));
	}
	@Override
	public void deleteByBuildingId(int id) {
		rentAreaReponsitory.deleteByBuildingId(id);
		
	}


}
