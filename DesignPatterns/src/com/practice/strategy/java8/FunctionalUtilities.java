package com.practice.strategy.java8;

import java.util.function.BinaryOperator;

public class FunctionalUtilities {
	static final BinaryOperator<Integer> add = (Integer a, Integer b) -> {
		return a+b;
	};
	static final BinaryOperator<Integer> sub = (Integer a, Integer b) -> {
		return a>b?(a-b):(b-a);
	};
}
