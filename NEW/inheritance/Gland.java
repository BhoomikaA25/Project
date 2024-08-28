package com.xworkz.DataTypes.things;

public class Gland {
public Mammals mammals;
	
	public void mamary()
	{
		if(mammals!=null)
		{
			mammals.Breath();
			mammals.Swim();
			mammals.Water();
		System.out.println(mammals.name+" "+mammals.color);
		}
		else
		{
			System.out.println("mammals  is null");
		}
	}

}
