package com.h.www.entity;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class Admin {
	private Integer uid;

	private String username;

	private String password;

	private String phone;

	private Date lastLoginTime;

	private String lastLoginIp;

	private Group group;

	private List<Function> funlist;

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public List<Function> getFunlist() {
		return funlist;
	}

	public void setFunlist(List<Function> funlist) {
		this.funlist = funlist;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Admin [uid=" + uid + ", username=" + username + ", password="
				+ password + ", phone=" + phone + ", lastLoginTime="
				+ lastLoginTime + ", lastLoginIp=" + lastLoginIp + ", group="
				+ group + ", funlist=" + funlist + "]";
	}

}