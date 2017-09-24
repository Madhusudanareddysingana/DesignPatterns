package com.practice.observer;

public class OnlineNotify implements Observer {

	@Override
	public void update(float interest) {
		// TODO Auto-generated method stub
		System.out.println("Online: Interest Rate updated, new Rate is: " + interest);

	}

}
