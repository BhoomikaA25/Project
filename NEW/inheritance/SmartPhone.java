package com.xworkz.NewApplication.inheritance;

public class SmartPhone {

	public String brand;
	public double price;
	public String color;
	public boolean Quality;
	
	public SmartPhone(){
		System.out.println("the smartphone with different properties");
	}

	public SmartPhone(String brand, int price, String color, boolean Quality) 
	{
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.Quality = Quality;
	}
	
	public void Call() 
	{
		System.out.println("Method running");
	}
	
	public void Phone() 
	{
		System.out.println("Method running");
	}
	
	
	public void Display()
	{
		System.out.println("brand is:"+this.brand);
		System.out.println("price is:"+this.price);
		System.out.println("color is:"+this.color);
		System.out.println("Camera Quality is:"+this.Quality);
	}

}


