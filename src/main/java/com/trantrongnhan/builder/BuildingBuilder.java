package com.trantrongnhan.builder;

public class BuildingBuilder {
	private String name;
	private String district;
	private String ward;
	private Integer buildingArea;
	private String manageName;
	private String managePhone;
	private String street;
	private Integer rentAreaFrom;
	private Integer rentAreaTo;
	private Integer rentCostFrom;
	private Integer rentCostTo;
	private String buildingTypes[];
	private Integer numberOfBasement;

	public String getName() {
		return name;
	}

	public String getDistrict() {
		return district;
	}

	public String getWard() {
		return ward;
	}

	public Integer getBuildingArea() {
		return buildingArea;
	}

	public String getManageName() {
		return manageName;
	}

	public String getManagePhone() {
		return managePhone;
	}

	public String getStreet() {
		return street;
	}

	public Integer getRentAreaFrom() {
		return rentAreaFrom;
	}

	public Integer getRentAreaTo() {
		return rentAreaTo;
	}

	public Integer getRentCostFrom() {
		return rentCostFrom;
	}

	public Integer getRentCostTo() {
		return rentCostTo;
	}

	public String[] getBuildingTypes() {
		return buildingTypes;
	}

	public Integer getNumberOfBasement() {
		return numberOfBasement;
	}



	public BuildingBuilder(String name, String district, String ward, Integer buildingArea, String manageName,
			String managePhone, String street, Integer rentAreaFrom, Integer rentAreaTo, Integer rentCostFrom,
			Integer rentCostTo, String[] buildingTypes, Integer numberOfBasement) {
		super();
		this.name = name;
		this.district = district;
		this.ward = ward;
		this.buildingArea = buildingArea;
		this.manageName = manageName;
		this.managePhone = managePhone;
		this.street = street;
		this.rentAreaFrom = rentAreaFrom;
		this.rentAreaTo = rentAreaTo;
		this.rentCostFrom = rentCostFrom;
		this.rentCostTo = rentCostTo;
		this.buildingTypes = buildingTypes;
		this.numberOfBasement = numberOfBasement;
	}



	public static class Builder {
		private String name;
		private String district;
		private String ward;
		private Integer buildingArea;
		private String manageName;
		private String managePhone;
		private String street;
		private Integer rentAreaFrom;
		private Integer rentAreaTo;
		private Integer rentCostFrom;
		private Integer rentCostTo;
		private String buildingTypes[];
		private Integer numberOfBasement;

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setDistrict(String district) {
			this.district = district;
			return this;
		}

		public Builder setWard(String ward) {
			this.ward = ward;
			return this;
		}

		public Builder setBuildingArea(Integer buildingArea) {
			this.buildingArea = buildingArea;
			return this;
		}

		public Builder setManageName(String manageName) {
			this.manageName = manageName;
			return this;
		}

		public Builder setManagePhone(String managePhone) {
			this.managePhone = managePhone;
			return this;
		}

		public Builder setStreet(String street) {
			this.street = street;
			return this;
		}

		public Builder setRentAreaFrom(Integer rentAreaFrom) {
			this.rentAreaFrom = rentAreaFrom;
			return this;
		}

		public Builder setRentAreaTo(Integer rentAreaTo) {
			this.rentAreaTo = rentAreaTo;
			return this;
		}

		public Builder setRentCostFrom(Integer rentCostFrom) {
			this.rentCostFrom = rentCostFrom;
			return this;
		}

		public Builder setRentCostTo(Integer rentCostTo) {
			this.rentCostTo = rentCostTo;
			return this;
		}

		public Builder setBuildingTypes(String[] buildingTypes) {
			this.buildingTypes = buildingTypes;
			return this;
		}

		public BuildingBuilder build() {
			return new BuildingBuilder(name, district, ward, buildingArea, manageName, managePhone, street,
					rentAreaFrom, rentAreaTo, rentCostFrom, rentCostTo, buildingTypes,numberOfBasement);
		}

		public Builder setNumberOfBasement(Integer numberOfBasement) {
			this.numberOfBasement = numberOfBasement;
			return this;
		}

	}

}
