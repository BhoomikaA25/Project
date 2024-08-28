package com.xworkz.DataTypes.things;

public class Shwetha {
	
	public void use(WaterBottle waterBottle) {
		if(waterBottle !=null)
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


