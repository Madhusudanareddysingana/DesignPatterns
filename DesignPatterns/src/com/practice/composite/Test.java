package com.practice.composite;

public class Test {
public static void main(String[] args) {
	
	//intialize for eclipses
	Eclipse eclipse=new Eclipse();
	Eclipse eclipse2=new Eclipse();
	Eclipse eclipse3=new Eclipse();
	Eclipse eclipse4=new Eclipse();
	
	//composite
	CompositeGraphic compositeGraphic=new CompositeGraphic();
	CompositeGraphic compositeGraphic2=new CompositeGraphic();
	CompositeGraphic compositeGraphic3=new CompositeGraphic();
	
	compositeGraphic.add(eclipse);
	compositeGraphic.add(eclipse2);
	compositeGraphic.add(eclipse3);
	
	compositeGraphic2.add(eclipse4);
	
	compositeGraphic3.add(compositeGraphic);
	compositeGraphic3.add(compositeGraphic2);
	
	compositeGraphic3.print();
}
}
