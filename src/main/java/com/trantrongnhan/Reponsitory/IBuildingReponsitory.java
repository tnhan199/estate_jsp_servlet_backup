package com.trantrongnhan.Reponsitory;

import java.util.List;
import java.util.Map;

import com.trantrongnhan.Entity.BuildingEntity;
import com.trantrongnhan.builder.BuildingBuilder;
import com.trantrongnhan.paging.Pageable;
import com.trantrongnhan.sorting.Sorter;

public interface IBuildingReponsitory {
	List<BuildingEntity>search(BuildingBuilder buildingBuilder,Pageable pageRequest,Sorter sorter);
	Map<String, Object>buildMapSearch(BuildingBuilder builder);
	
}
