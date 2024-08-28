package com.xworkz.DataTypes.run;

import com.xworkz.DataTypes.things.Devu;
import com.xworkz.DataTypes.things.Ganashree;
import com.xworkz.DataTypes.things.Shwetha;
import com.xworkz.DataTypes.things.WaterBottle;

public class WaterBottleRunner {
	public static void main(String [] args) {
		Ganashree gana= new Ganashree();
		gana.purchse();
		
		Shwetha shwetha = new Shwetha();
		WaterBottle waterBottle = new WaterBottle();
		shwetha.use(waterBottle);
		
		Devu devu=new Devu();
		WaterBottle waterBottle1=new WaterBottle();
        devu.waterBottle=waterBottle1;
        devu.use();
	}

}
