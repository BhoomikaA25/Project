package com.xworkz.DataTypes.run;

import com.xworkz.DataTypes.things.Divya;
import com.xworkz.DataTypes.things.Harshitha;
import com.xworkz.DataTypes.things.Omkar;
import com.xworkz.DataTypes.things.Shoe;

public class ShoeRunner {

	public static void main(String[] args) {
		
		Divya divya=new Divya();
		divya.Wear();
		
		Omkar omkar=new Omkar();
		Shoe shoe=new Shoe();
		omkar.buy(shoe);
		
		Harshitha harshitha=new Harshitha();
		Shoe shoe1=new Shoe();
		harshitha.shoe=shoe1;
		harshitha.tear();
	}

}
