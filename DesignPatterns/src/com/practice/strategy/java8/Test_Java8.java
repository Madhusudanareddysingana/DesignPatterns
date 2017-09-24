package com.practice.strategy.java8;

//https://en.wikibooks.org/wiki/Computer_Science_Design_Patterns/Strategy

public class Test_Java8 {
public static void main(String[] args) {
	ContextClass contextClass=null;
	contextClass=new  ContextClass(FunctionalUtilities.add);
	System.out.println(contextClass.executeLogic(10	, 20));
	contextClass=new  ContextClass(FunctionalUtilities.sub);
	System.out.println(contextClass.executeLogic(10	, 20));
}
}
