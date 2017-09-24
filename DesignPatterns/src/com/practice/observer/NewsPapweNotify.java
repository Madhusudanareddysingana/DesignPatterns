package com.practice.observer;

public class NewsPapweNotify implements Observer {

	@Override
	public void update(float interest) {
		// TODO Auto-generated method stub
		System.out.println("Newspaper: Interest Rate updated, new Rate is: " + interest);
	}

}
