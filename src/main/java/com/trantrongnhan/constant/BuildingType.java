package com.trantrongnhan.constant;

public enum BuildingType {
	NGUYEN_CAN("Nguyên Căn"),
	NOI_THAT("Nội Thất"),
	TANG_TRET("Tầng Trệt");
	private final String value;
	BuildingType(String value) {
		this.value=value;
	}
	public String getBuildingType() {
		return this.value;
	}
}
