package com.xworkz.DataTypes.things;

public class WarmBlooded {
	
	public void Blood(Mammals mammals)
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
			System.out.println("mammal class is null");
		}
	}

}
