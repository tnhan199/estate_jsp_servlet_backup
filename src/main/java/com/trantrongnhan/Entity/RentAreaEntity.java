package com.trantrongnhan.Entity;

import com.trantrongnhan.annotations.Column;
import com.trantrongnhan.annotations.Entity;
import com.trantrongnhan.annotations.Table;

@Entity
@Table(name="rentarea")
public class RentAreaEntity {
	private Integer value;
	private Integer buildingId;
	@Column(name="value")
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	@Column(name="buildingid")
	public Integer getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}
}
