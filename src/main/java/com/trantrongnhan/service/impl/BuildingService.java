package com.trantrongnhan.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.trantrongnhan.DTO.BuildingDTO;
import com.trantrongnhan.DTO.RentAreaDTO;
import com.trantrongnhan.Entity.BuildingEntity;
import com.trantrongnhan.Reponsitory.impl.BuildingReponsitory;
import com.trantrongnhan.builder.BuildingBuilder;
import com.trantrongnhan.converter.BuildingConverter;
import com.trantrongnhan.paging.PageRequest;
import com.trantrongnhan.paging.Pageable;
import com.trantrongnhan.service.IBuildingService;
import com.trantrongnhan.sorting.Sorter;

public class BuildingService implements IBuildingService {
	private BuildingConverter buildingConverter;
	private BuildingReponsitory buildingReponsitory;
	private RentAreaService rentAreaService;
	public BuildingService() {
		buildingConverter=new BuildingConverter();
		buildingReponsitory=new BuildingReponsitory();
		rentAreaService=new RentAreaService();
	}

	@Override
	public Integer insert(BuildingDTO dto) {
		String s=dto.getRentArea();
		Integer id=buildingReponsitory.insert(buildingConverter.toEntity(dto));
		if(s!=null && !s.equals("")) {
			String[] arr=s.split(",");
			for(String i:arr) {
				RentAreaDTO temp=new RentAreaDTO();
				temp.setBuildingId(id);
				temp.setValue(Integer.valueOf(i));
				rentAreaService.insert(temp);
			}
		}
		return id;
	}

	@Override
	public void update(BuildingDTO dto) {
		rentAreaService.deleteByBuildingId(dto.getId());
		Stream.of(dto.getRentArea().split(",")).mapToInt(i->Integer.valueOf(i)).forEach(i->{
			RentAreaDTO rentAreaDTO=new RentAreaDTO();
			rentAreaDTO.setBuildingId(dto.getId());
			rentAreaDTO.setValue(i);
			rentAreaService.insert(rentAreaDTO);
		});
		buildingReponsitory.update(buildingConverter.toEntity(dto));
	}

	@Override
	public void delete(List<Integer> id) {
		for(Integer i:id) {
			rentAreaService.deleteByBuildingId(i);
			buildingReponsitory.delete(i);
		}
	}

	@Override
	public BuildingDTO findById(Integer id) {
		return buildingConverter.toDTO(buildingReponsitory.findById(id));
	}

	@Override
	public List<BuildingDTO> findAll() {
		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
		List<BuildingEntity>list=buildingReponsitory.findAll();
		for(BuildingEntity i:list) {
			result.add(buildingConverter.toDTO(i));
		}
		return result;
	}

	@Override
	public List<BuildingDTO> search(BuildingDTO obj,PageRequest pageRequest,Sorter sorter) {
		// TODO Auto-generated method stub
		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
		List<BuildingEntity>list=buildingReponsitory.search(buildingConverter.toEntity(obj),pageRequest,sorter);
		for(BuildingEntity i:list) {
			result.add(buildingConverter.toDTO(i));
		}
		return result;
		
	}

	@Override
	public List<BuildingDTO> search(BuildingBuilder buildingBuilder, Pageable pageable, Sorter sorter,Object...where) {
		List<BuildingDTO> result=new ArrayList<BuildingDTO>();
		List<BuildingEntity>list=buildingReponsitory.search(buildingBuilder, pageable, sorter);
		for(BuildingEntity i:list) {
			result.add(buildingConverter.toDTO(i));
		}
		return result;
	}

	

}
