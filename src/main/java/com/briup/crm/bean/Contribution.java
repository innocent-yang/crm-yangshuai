package com.briup.crm.bean;

public class Contribution {
	
	private String name;
	private float y;
	
	public Contribution() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Contribution [name=" + name + ", y=" + y + "]";
	}
	
	
}
