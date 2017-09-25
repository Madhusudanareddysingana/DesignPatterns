package com.practice.composite.example;

public class PermanentEmployee implements TCS_Employer{
	private int id;
	private String name;
	public PermanentEmployee(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PermanentEmployee [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", dept=");
		builder.append(dept);
		builder.append("]");
		return builder.toString();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	private String dept;
	@Override
	public void enrollAttendance() {
		// TODO Auto-generated method stub
		System.out.println("permanent-employee");
	}

}
