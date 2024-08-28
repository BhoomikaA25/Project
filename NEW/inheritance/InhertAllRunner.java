package com.xworkz.NewApplication.inheritance;

public class InhertAllRunner {

	public static void main(String[] args) {
		Bulb bulb1=new Bulb();
	    bulb1.color="White";
		bulb1.glow();
		
		Bulb bulb = new Light();
		bulb.color="Red";
		bulb.glow();
	    System.out.println("----------------------------------");
	   
	   Halwa halwa1 = new Halwa();
	   halwa1.flavour="Pineapple";
	   halwa1.grams=30;
	   halwa1.cost=60;
	   halwa1.Halwai();
	   
	   Halwa halwa = new Sweet();
	   halwa.flavour="Carrot";
	   halwa.grams=30;
	   halwa.cost=160;
	   halwa.Halwai();
	   System.out.println("--------------------------------");
	   
	  
	   SmartPhone smart = new Device();
	   smart.brand="Oppo F17";
	   smart.color="Blue";
	   smart.price=21000;
	   smart.Quality=true;
	   smart.Display();
	   
	   SmartPhone smart1= new SmartPhone();
	   smart1.brand="Redme";
	   smart1.color="Black";
	   smart1.price=22000;
	   smart1.Quality=true;
	   smart1.Display();
	   System.out.println("----------------------------------");
	   
	   Bull bull = new Bull();
	   bull.color="Brown";
	   bull.cost=990;
	   bull.gender="Male";
	   bull.famousBreed=true;
	   bull.purpose="fighting";
	   bull.Display();
	   
	   Bull bull1 = new Animal();
	   bull1.color="Black";
	   bull1.cost=9090;
	   bull1.gender="Male";
	   bull1.famousBreed=true;
	   bull1.purpose="fighting";
	   
	   bull1.Display();
	   System.out.println("----------------------------------");
	   
	   Chicken chicken1=new NonVeg();
		chicken1.type="chicken kabab";
		chicken1.price=80;
		chicken1.gender="male";
		chicken1.quantity=2;
		chicken1.use="Protien";
		chicken1.breed="local";
		chicken1.lifespan=30;
		chicken1.rank="Species";
		chicken1.quality="good";
		chicken1.color="Red";
		chicken1.Display();
		System.out.println("---------------------------------");
	
	   
	   

	}

}
