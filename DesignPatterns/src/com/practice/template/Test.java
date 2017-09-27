package com.practice.template;

public class Test {
public static void main(String[] args) {
	PlantAbstractClass class1=
			new FlowerTrees();
	class1.getTheBenifitsFromPlant();
	System.out.println("---------------------------");
	PlantAbstractClass class2=
			new ForestTrees();
	class2.getTheBenifitsFromPlant();
}
}
