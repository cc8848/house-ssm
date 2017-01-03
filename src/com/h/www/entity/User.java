package com.h.www.entity;

import java.util.Date;

public class User {
	private Integer uid;

	private String uname;

	private String uindentyid;

	private String phone;

	private Date uborndate;

	private String uillness;

	private String userDescrib;

	private Integer houseid;

	private Boolean ishouseOwner;

	private House house;

	private HouseDept houseDept;

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUindentyid() {
		return uindentyid;
	}

	public void setUindentyid(String uindentyid) {
		this.uindentyid = uindentyid;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getUborndate() {
		return uborndate;
	}

	public void setUborndate(Date uborndate) {
		this.uborndate = uborndate;
	}

	public String getUillness() {
		return uillness;
	}

	public void setUillness(String uillness) {
		this.uillness = uillness;
	}

	public String getUserDescrib() {
		return userDescrib;
	}

	public void setUserDescrib(String userDescrib) {
		this.userDescrib = userDescrib;
	}

	public Integer getHouseid() {
		return houseid;
	}

	public void setHouseid(Integer houseid) {
		this.houseid = houseid;
	}

	public Boolean getIshouseOwner() {
		return ishouseOwner;
	}

	public void setIshouseOwner(Boolean ishouseOwner) {
		this.ishouseOwner = ishouseOwner;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public HouseDept getHouseDept() {
		return houseDept;
	}

	public void setHouseDept(HouseDept houseDept) {
		this.houseDept = houseDept;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uindentyid="
				+ uindentyid + ", phone=" + phone + ", uborndate=" + uborndate
				+ ", uillness=" + uillness + ", userDescrib=" + userDescrib
				+ ", houseid=" + houseid + ", ishouseOwner=" + ishouseOwner
				+ ", house=" + house + ", houseDept=" + houseDept + "]";
	}

}