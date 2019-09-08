package com.trantrongnhan.DTO;

public class RentAreaDTO extends AbstractDTO {
	private Integer value;
	private Integer buildingId;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
}
