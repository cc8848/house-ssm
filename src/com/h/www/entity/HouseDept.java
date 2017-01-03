package com.h.www.entity;

public class HouseDept {
	private Integer id;

	private Integer houseid;

	private Double debt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Double getDebt() {
		return debt;
	}

	public void setDebt(Double debt) {
		this.debt = debt;
	}

	@Override
	public String toString() {
		return "HouseDept [id=" + id + ", houseid=" + houseid + ", debt=" + debt
				+ "]";
	}

}