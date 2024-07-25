class RupeeRunner{
	public static void main(String[] args){
		Rupee rupee = new Rupee();
		int coins= rupee.coins;            // prints default value
		System.out.println("The declared value is: "+coins);
		
		String name = rupee.name;
		System.out.println("The declared value is: "+name);
		
		double ruPrice=rupee.ruPrice;
		System.out.println("The declared value is: "+ruPrice);
		
		System.out.println("================");
		



		AirCondition airCondition = new AirCondition();
		String airBrand= airCondition.airBrand;
		System.out.println("The declared value is: "+airBrand);
		
		double airprice = airCondition.airprice;
		System.out.println("The declared value is: "+airprice);
		
		int airNum= airCondition.airNum;
		System.out.println("The declared value is: "+airNum);
		System.out.println("=====================");
		
		

		Autorikshaw autorikshaw = new Autorikshaw();
		String brand= autorikshaw.brand;
		System.out.println("The declared value is: "+brand);
		
		double price = autorikshaw.price;
		System.out.println("The declared value is: "+price);
		
		int num= autorikshaw.num;
		System.out.println("The declared value is: "+num);
		System.out.println("======================");



       Rapido rapido=new Rapido();
	   String name1=rapido.name1;
	   System.out.println("the name default value is:"+name1);
	   
	   String driverName1=rapido.driverName1;
	   System.out.println("the driverName default value is:"+driverName1);
	   
	   double number1=rapido.number1;
	   System.out.println("the autonumber default value is:"+number1);
	   System.out.println("===============================");
	   

	  
	   CabCompany cabCompany=new CabCompany(); 
	   String carName=cabCompany.carName;
	   System.out.println("The name default value is:"+carName);
	 
	   double carPrice=cabCompany.carPrice;
	   System.out.println("The driverName default value is:"+carPrice);
	   
	   String driverName2=cabCompany.driverName2;
	   System.out.println("The autonumber default value is:"+driverName2);
	   System.out.println("===============================");
	   


	
	   BMTC bMTC=new BMTC();
	   String busName=bMTC.busName;
	   
	   System.out.println("the name default value is:"+busName);
	   double busPrice=bMTC.busPrice;
	   
	   System.out.println("the driverName default value is:"+busPrice);
	   String destination=bMTC.destination;
	   
	   System.out.println("the autonumber default value is:"+destination);
	   System.out.println("===============================");
	   


	   FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
	   String menu=foodDeliveryCompany.menu;
	   System.out.println("the name default value is:"+menu);
	   
	   String foodName=foodDeliveryCompany.foodName;
	   System.out.println("the driverName default value is:"+foodName);
	   
	   int foodPrice=foodDeliveryCompany.foodPrice;
	   System.out.println("the autonumber default value is:"+foodPrice);
	   System.out.println("===============================");
	}
}

