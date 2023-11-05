package com.coreJava.Java8Feature;

public class Dep {
	
	private String depName;

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Dep [depName=" + depName + "]";
	}

	public Dep(String depName) {
		super();
		this.depName = depName;
	}
	

}
