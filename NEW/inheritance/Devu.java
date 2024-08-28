package com.xworkz.DataTypes.things;

public class Devu {
	WaterBottle waterBottle;
	public void use() {
		if(waterBottle!=null)
		{
			waterBottle.fill();
			waterBottle.empty();
			waterBottle.crush();
			System.out.println(waterBottle.quantity+" "+waterBottle.color);
		}
		else
		{
			System.out.println("watterbottle is null");
		}
		
	}

}
