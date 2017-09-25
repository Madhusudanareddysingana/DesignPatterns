package com.practice.composite.example;

import java.util.ArrayList;
import java.util.List;

public class Tcs_Employess_Composite implements TCS_Employer {

	List<TCS_Employer> employess = new ArrayList();

	public Tcs_Employess_Composite() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enrollAttendance() {
		
	}

	public void add(TCS_Employer employee) {
		employess.add(employee);
	}

	public void remove(TCS_Employer employee) {
		employess.remove(employee);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tcs_Employess_Composite [employess=");
		builder.append(employess);
		builder.append("]");
		return builder.toString();
	}

	public void todayAttendess() {
		for (TCS_Employer employee : employess) {
			System.out.println(employee);
		}
	}
}
