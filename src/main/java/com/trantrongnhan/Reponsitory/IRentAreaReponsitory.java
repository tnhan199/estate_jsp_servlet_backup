package com.trantrongnhan.Reponsitory;

import com.trantrongnhan.Entity.RentAreaEntity;

public interface IRentAreaReponsitory {
	Integer save(RentAreaEntity renAreaEntity);
	void deleteByBuildingId(Integer id);
}
