package com.practice.template;

public abstract class PlantAbstractClass {
	
	public void getTheBenifitsFromPlant() {
		sappleATree();
		pourWater();
		fertilizeThemForFasterGrowth();
		getBenifitsIntermsOfFruits();

	}

	// First it should be sappled/seeded
	// so it is default
	void sappleATree() {
		System.out.println("Tree-sappled ");
	}

	abstract void pourWater();

	abstract void fertilizeThemForFasterGrowth();

	abstract void getBenifitsIntermsOfFruits();

	// Any tree will gives the wood
	void getBenifitsIntermsOfWood() {
		System.out.println("Tree gives us wood");
	}
}
