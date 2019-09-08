package com.trantrongnhan.Reponsitory.impl;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.trantrongnhan.Entity.BuildingEntity;
import com.trantrongnhan.Reponsitory.IBuildingReponsitory;
import com.trantrongnhan.builder.BuildingBuilder;
import com.trantrongnhan.paging.Pageable;
import com.trantrongnhan.sorting.Sorter;
 
public class BuildingReponsitory extends AbstractReponsitory<BuildingEntity> implements IBuildingReponsitory {

	@Override
	public List<BuildingEntity> search(BuildingBuilder buildingBuilder, Pageable pageRequest, Sorter sorter) {
		StringBuilder where=new StringBuilder("");
		if(buildingBuilder.getRentCostFrom()!=null) {
			where.append(" and rentcost>="+buildingBuilder.getRentCostFrom());
		}
		if(buildingBuilder.getRentCostTo()!=null) {
			where.append(" and rentcost<="+buildingBuilder.getRentCostTo());
		}
		if(buildingBuilder.getRentAreaFrom()!=null || buildingBuilder.getRentAreaTo()!=null) {
			where.append(" and exists (select * from rentarea v where u.id=v.buildingid");
			if(buildingBuilder.getRentAreaFrom()!=null) {
				where.append(" and v.value>="+buildingBuilder.getRentAreaFrom());
			}
			if(buildingBuilder.getRentAreaTo()!=null) {
				where.append(" and v.value<="+buildingBuilder.getRentAreaTo());
			}
			where.append(")");
		}
		String[] buildingTypes=buildingBuilder.getBuildingTypes();
		if(buildingTypes!=null && buildingTypes.length>0) {
			where.append(" and (");
			for(int i=0;i<buildingTypes.length;i++) {
				where.append("type like '%"+buildingTypes[i]+"%'");
				if(i<buildingTypes.length-1) {
					where.append(" or ");
				}
				else {
					where.append(")");
				}
			}
		}
		return search(buildMapSearch(buildingBuilder), pageRequest, sorter, where.toString());
	}
	@Override
	public Map<String, Object> buildMapSearch(BuildingBuilder builder) {
		Map<String,Object>result=new HashMap<String,Object>();
		Field[] fields=builder.getClass().getDeclaredFields();
		for(Field i:fields) {
			if(!i.getName().equals("rentAreaFrom") && !i.getName().equals("rentAreaTo") && !i.getName().equals("rentCostFrom") && !i.getName().equals("rentCostTo") && !i.getName().equals("buildingTypes")) {
				try {
					i.setAccessible(true);
					result.put(i.getName(), i.get(builder));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				} catch (IllegalAccessException e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}	
		}
		return result;
		
	}

}
