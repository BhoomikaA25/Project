package com.xworkz.DataTypes.run;

import com.xworkz.DataTypes.things.Gland;
import com.xworkz.DataTypes.things.Home;
import com.xworkz.DataTypes.things.Mammals;
import com.xworkz.DataTypes.things.WarmBlooded;

public class MammalsRunner {
public static void main(String[] args) {
		
		Home home=new Home();
		home.live();
		
		WarmBlooded warmBlooded=new WarmBlooded();
		Mammals mammal=new Mammals();
		warmBlooded.Blood(mammal);
		
		Gland gland=new Gland();
		Mammals mammal1=new Mammals();
		gland.mammal1=mammal;
		gland.mamary();
	}

}
