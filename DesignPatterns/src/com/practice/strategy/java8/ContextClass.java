package com.practice.strategy.java8;

import java.util.function.BinaryOperator;

public class ContextClass {
	private BinaryOperator<Integer> strategy;

	public ContextClass(BinaryOperator<Integer> strategy) {
		this.strategy = strategy;
	}
	public Integer executeLogic(final int a, final int b) {
		return this.strategy.apply(a, b);
	}
}
