package com.trantrongnhan.service;

import com.trantrongnhan.DTO.RentAreaDTO;

public interface IRentAreaService {
	Integer insert(RentAreaDTO rentAreaDTO);
	void deleteByBuildingId(int id);
	
}
