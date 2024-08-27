package com.xworkz.NewApplication.inheritance;

public class Halwa {
	 public String flavour;
	 public float grams;
	 public int cost;
	 
	  public Halwa() {
		 System.out.println("Const running..");
		 
	 }
	 
	 public Halwa(String flavour, float grams,int cost) {
		 this.flavour=flavour;
		 this.grams=grams;
		 this.cost=cost;
		 
		 
	 }
	 
	 public void Halwai() {
		 System.out.println("Flavour :" + this.flavour);
		 System.out.println("Grams :" + this.grams);
		 System.out.println("Cost :" + this.cost);
		 
	 }
	 
	 public void order() {
		 System.out.println();
	 }

}
