package com.practice.observer;

public class Test {
public static void main(String[] args) {
	NewsPapweNotify newsPapweNotify=new NewsPapweNotify();
	OnlineNotify onlineNotify=new OnlineNotify();
	
	Loan loan=new  Loan();
	loan.setInterest(15.25f);
	
	loan.registerObserver(newsPapweNotify);
	loan.registerObserver(onlineNotify);
	loan.setInterest(23.56f);
	
}
}
