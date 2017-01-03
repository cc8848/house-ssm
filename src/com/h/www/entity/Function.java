package com.h.www.entity;

public class Function {
    private Integer id;

    private String funName;

    private String funUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunName() {
        return funName;
    }

    public void setFunName(String funName) {
        this.funName = funName;
    }

    public String getFunUrl() {
        return funUrl;
    }

    public void setFunUrl(String funUrl) {
        this.funUrl = funUrl;
    }

	@Override
	public String toString() {
		return "Function [id=" + id + ", funName=" + funName + ", funUrl="
				+ funUrl + "]";
	}
    
}