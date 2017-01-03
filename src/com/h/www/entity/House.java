package com.h.www.entity;

public class House {
	private Integer houseid;

	private Integer housezorn;

	private Integer housebuilding;

	private Integer houselevel;

	private Integer houseroomnum;

	private Double housesize;

	private Boolean ishouseenpty;
	
	private HouseDept houseDept;

	public HouseDept getHouseDept() {
		return houseDept;
	}

	public void setHouseDept(HouseDept houseDept) {
		this.houseDept = houseDept;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Integer getHousezorn() {
		return housezorn;
	}

	public void setHousezorn(Integer housezorn) {
		this.housezorn = housezorn;
	}

	public Integer getHousebuilding() {
		return housebuilding;
	}

	public void setHousebuilding(Integer housebuilding) {
		this.housebuilding = housebuilding;
	}

	public Integer getHouselevel() {
		return houselevel;
	}

	public void setHouselevel(Integer houselevel) {
		this.houselevel = houselevel;
	}

	public Integer getHouseroomnum() {
		return houseroomnum;
	}

	public void setHouseroomnum(Integer houseroomnum) {
		this.houseroomnum = houseroomnum;
	}

	public Double getHousesize() {
		return housesize;
	}

	public void setHousesize(Double housesize) {
		this.housesize = housesize;
	}

	public Boolean getIshouseenpty() {
		return ishouseenpty;
	}

	public void setIshouseenpty(Boolean ishouseenpty) {
		this.ishouseenpty = ishouseenpty;
	}

	@Override
	public String toString() {
		return "House [houseid=" + houseid + ", housezorn=" + housezorn
				+ ", housebuilding=" + housebuilding + ", houselevel="
				+ houselevel + ", houseroomnum=" + houseroomnum + ", housesize="
				+ housesize + ", ishouseenpty=" + ishouseenpty + ", houseDept="
				+ houseDept + "]";
	}

}