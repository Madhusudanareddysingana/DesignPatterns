package com.practice.composite;

import java.util.ArrayList;
import java.util.List;
//composite
public class CompositeGraphic implements Graphic {

	List<Graphic> lists = new ArrayList<>();

	

	// add an elemnt
	public void add(Graphic graphic) {
		lists.add(graphic);
	}

	// remove an elemnt
	public void remove(Graphic graphic) {
		lists.remove(graphic);
	}
	
	//print
	@Override
	public void print() {
		for(Graphic graphic:lists) {
			graphic.print();
		}
	}
}
