package com.h.www.entity;

public class Group {
    private Integer id;

    private Integer uid;

    private String groupName;

    private String functionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

	@Override
	public String toString() {
		return "Group [id=" + id + ", uid=" + uid + ", groupName=" + groupName
				+ ", functionId=" + functionId + "]";
	}
    
}