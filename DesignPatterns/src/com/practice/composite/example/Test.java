package com.practice.composite.example;

public class Test {
public static void main(String[] args) {
	//yes
	//contract employess
	TCS_Employer tcs_Employer=new ContractEmployee(111,"abc","HR");
	TCS_Employer tcs_Employer2=new ContractEmployee(222,"ghy","FINANCE");
	TCS_Employer tcs_Employer3=new ContractEmployee(333,"NMO","ANALYTICS");
	
	//permanent
	TCS_Employer tcs_Employer4=new PermanentEmployee(555,"Meru","HR");
	TCS_Employer tcs_Employer5=new PermanentEmployee(45645,"fdgsd","R&D");
	
	//composite
	//for contract employess
	Tcs_Employess_Composite composite=new Tcs_Employess_Composite();
	//for permanent employess
	Tcs_Employess_Composite composite2=new Tcs_Employess_Composite();
	// for both
	Tcs_Employess_Composite composite3=new Tcs_Employess_Composite();
	
	
	composite.add(tcs_Employer);
	composite.add(tcs_Employer2);
	composite.add(tcs_Employer3);
	
	composite2.add(tcs_Employer4);
	composite2.add(tcs_Employer5);
	
	//adding both to parent
	composite3.add(composite2);
	composite3.add(composite);
	
	composite3.todayAttendess();
	
}
}
