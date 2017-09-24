package com.practice.strategy;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// Get the input from user.
		Scanner scanner = new Scanner(System.in);

		// Store in a string
		String userInput = scanner.nextLine();

		// Intalization
		MakePayment makePayment = null;
		PaymentContext paymentContext = null;

		// Null check and create PAyment object based on inputString.
		if (userInput != null) {
			MakePayment makePaymentObj = createObjectBasedOnUserInput(userInput);
			// create a conext object
			paymentContext = new PaymentContext(makePaymentObj);
		}

		// do the actual paymet
		if (paymentContext != null) {
			paymentContext.chooseYourPaymentTypeMethod();
		}

	}

	private static MakePayment createObjectBasedOnUserInput(String userInput) {
		// create your own/likable strategy payment type,Iam choosing Mobile
		MakePayment makePayment = null;

		// getName gives you fully qualified class com.practice.strategy.MobilePayment
		if (MobilePayment.class.getName().contains(userInput)) {
			makePayment = new MobilePayment();
		}
		if (OnlinePayment.class.getName().contains(userInput)) {
			makePayment = new OnlinePayment();
		}
		if (CashOnDelivery.class.getName().contains(userInput)) {
			makePayment = new CashOnDelivery();
		}
		return makePayment;
	}
}
