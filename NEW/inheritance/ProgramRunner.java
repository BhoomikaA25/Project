package com.xworkz.NewApplication.inheritance;

import com.xworkz.NewApplication.inheritance.*;

public class ProgramRunner {

	public static void main(String[] args) {
	
		Bulb bulb = new Light();
		bulb.color="Red";
		bulb.glow();
	   System.out.println("----------------------------------------");
	   
	   Halwa halwa = new Sweet();
	   halwa.flavour="Carrot";
	   halwa.grams=30;
	   halwa.cost=160;
	   System.out.println("----------------------------------------");
	   
	   
		
 
	}
	
	

}
