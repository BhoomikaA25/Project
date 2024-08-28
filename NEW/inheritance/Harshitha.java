package com.xworkz.DataTypes.things;

public class Harshitha {
	public Shoe shoe;
	
	public void tear(){
		if(shoe!=null) {
			shoe.safeGuard();
			System.out.println(shoe.brand+""+shoe.brand);
		}
		
		else {
			System.out.println("shoe is null");
		}
		
	}
	

}
