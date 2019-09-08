package com.trantrongnhan.DTO;

import java.util.List;

import com.trantrongnhan.constant.BuildingType;
import com.trantrongnhan.constant.District;

public class BuildingDTO extends AbstractDTO {
	private String name;

	private String ward;

	private String structure;

	private String street;

	private String rentArea;

	private String district;

	private String manageName;

	private String managePhone;

	private String direction;

	private String areaDescription;

	private String costDescription;

	private String serviceCost;

	private String motorbikeCost;

	private String carCost;

	private String overtimeCost;

	private String electricityCost;

	private String deposit;

	private String payment;

	private String rentPeriod;

	private Integer numberOfBasement;

	private Integer buidingArea;

	private Integer level;

	private Integer rentCost;

	private String type;

	private String[] buildingTypes;

	private Integer rentAreaFrom;

	private Integer rentAreaTo;

	private Integer rentCostFrom;

	private Integer rentCostTo;

	private List<BuildingDTO> listResult;

	private List<District> listDistrict;

	private List<BuildingType> listBuildingType;
	
	private List<Integer> listId;
	
	private String location;
	
	private Integer totalPage;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getRentArea() {
		return rentArea;
	}

	public void setRentArea(String rentArea) {
		this.rentArea = rentArea;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getManageName() {
		return manageName;
	}

	public void setManageName(String manageName) {
		this.manageName = manageName;
	}

	public String getManagePhone() {
		return managePhone;
	}

	public void setManagePhone(String managePhone) {
		this.managePhone = managePhone;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(String serviceCost) {
		this.serviceCost = serviceCost;
	}

	public String getMotorbikeCost() {
		return motorbikeCost;
	}

	public void setMotorbikeCost(String motorbikeCost) {
		this.motorbikeCost = motorbikeCost;
	}

	public String getCarCost() {
		return carCost;
	}

	public void setCarCost(String carCost) {
		this.carCost = carCost;
	}

	public String getOvertimeCost() {
		return overtimeCost;
	}

	public void setOvertimeCost(String overtimeCost) {
		this.overtimeCost = overtimeCost;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getRentPeriod() {
		return rentPeriod;
	}

	public void setRentPeriod(String rentPeriod) {
		this.rentPeriod = rentPeriod;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}

	public void setNumberOfBasement(Integer numberOfBasement) {
		this.numberOfBasement = numberOfBasement;
	}

	public Integer getBuildingArea() {
		return buidingArea;
	}

	public void setBuildingArea(Integer buidingArea) {
		this.buidingArea = buidingArea;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getRentCost() {
		return rentCost;
	}

	public void setRentCost(Integer rentCost) {
		this.rentCost = rentCost;
	}

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}

	public String getCostDescription() {
		return costDescription;
	}

	public void setCostDescription(String costDescription) {
		this.costDescription = costDescription;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getElectricityCost() {
		return electricityCost;
	}

	public void setElectricityCost(String electricityCost) {
		this.electricityCost = electricityCost;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public Integer getBuidingArea() {
		return buidingArea;
	}

	public void setBuidingArea(Integer buidingArea) {
		this.buidingArea = buidingArea;
	}

	public String[] getBuildingTypes() {
		return buildingTypes;
	}

	public void setBuildingTypes(String[] buildingTypes) {
		this.buildingTypes = buildingTypes;
	}

	public Integer getRentAreaFrom() {
		return rentAreaFrom;
	}

	public void setRentAreaFrom(Integer rentAreaFrom) {
		this.rentAreaFrom = rentAreaFrom;
	}

	public Integer getRentAreaTo() {
		return rentAreaTo;
	}

	public void setRentAreaTo(Integer rentAreaTo) {
		this.rentAreaTo = rentAreaTo;
	}

	public Integer getRentCostFrom() {
		return rentCostFrom;
	}

	public void setRentCostFrom(Integer rentCostFrom) {
		this.rentCostFrom = rentCostFrom;
	}

	public Integer getRentCostTo() {
		return rentCostTo;
	}

	public void setRentCostTo(Integer rentCostTo) {
		this.rentCostTo = rentCostTo;
	}

	public List<BuildingDTO> getListResult() {
		return listResult;
	}

	public void setListResult(List<BuildingDTO> listResult) {
		this.listResult = listResult;
	}

	public List<BuildingType> getListBuildingType() {
		return listBuildingType;
	}

	public void setListBuildingType(List<BuildingType> listBuildingType) {
		this.listBuildingType = listBuildingType;
	}

	public List<District> getListDistrict() {
		return listDistrict;
	}

	public void setListDistrict(List<District> listDistrict) {
		this.listDistrict = listDistrict;
	}

	public List<Integer> getListId() {
		return listId;
	}

	public void setListId(List<Integer> listId) {
		this.listId = listId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}


}
