package com.xworkz.NewApplication.inheritance;

public class Bulb {
	public String color;
	
	public Bulb(){
		System.out.println("Bulb running in constructor");
				
	}
	
	public Bulb(String color) {
		this.color=color;
		
		
	}
	public void glow() {
		System.out.println("color:"+this.color);
	}
	
	

}
