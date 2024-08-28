package com.xworkz.DataTypes.things;

public class Shoe {
	public String brand="Puma";
	public int cost=4000;
	
	public Shoe() {
		System.out.println("the argumets runs in non parameterized constrctor");
	}
	
	public void safeGuard() {
		System.out.println("Shoe having save guard");
	}
	
	public void enhanceWalk() {
		System.out.println("Enhancing walk");
	}

}
