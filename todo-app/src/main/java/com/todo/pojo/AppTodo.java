package com.todo.pojo;

import java.util.Date;

public class AppTodo {
	
	int id;
	
	String desc;
	
	Date PendingTill;
	
	boolean isComp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getPendingTill() {
		return PendingTill;
	}

	public void setPendingTill(Date pendingTill) {
		PendingTill = pendingTill;
	}

	public boolean isComp() {
		return isComp;
	}

	public void setComp(boolean isComp) {
		this.isComp = isComp;
	}

	public AppTodo() {
		super();
	}

	public AppTodo(int id, String desc, Date pendingTill, boolean isComp) {
		super();
		this.id = id;
		this.desc = desc;
		PendingTill = pendingTill;
		this.isComp = isComp;
	}

	@Override
	public String toString() {
		return "AppTodo [id=" + id + ", desc=" + desc + ", PendingTill=" + PendingTill + ", isComp=" + isComp + "]";
	}

	

}
