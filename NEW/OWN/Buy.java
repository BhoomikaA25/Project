class Buy{
	public static void product(String brand,double price ){
		System.out.println("Brand :"+brand);
		System.out.println("Price :"+price);
		if(price>100 && price<=200)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}

	public static void product(String name,int quality,String quantity,double price){
		System.out.println("name :"+name);
		System.out.println("quality :"+quality);
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
		if(price>200 && price<=90000)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void bookMovieTicket(String name,String theaterName,int quantity,double price){
		System.out.println("name :"+name);
		System.out.println("theaterName :"+theaterName);
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
		if(quantity>250 && quantity<=2000)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void buyEgg(int total,double pricePerEgg){
		System.out.println("total :"+total);
		System.out.println("pricePerEgg :"+pricePerEgg);
		
		if(pricePerEgg>6 && pricePerEgg<=50)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void buyShampoo(int quantityInMl,double price,String brand,String manfDate){
		System.out.println("quantityInMl :"+quantityInMl);
		System.out.println("price :"+price);
		System.out.println("Brand :"+brand);
		System.out.println("manfDate :"+manfDate);
		
		if(quantityInMl>180 && quantityInMl<=850)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void buyCake(char size,String type,String flavour,double cost,int quantity){
		System.out.println("size :"+size);
		System.out.println("type :"+type);
		System.out.println("flavour :"+flavour);
		System.out.println("cost :"+cost);
		System.out.println("quantity :"+quantity);
		
		if(cost>200 && cost<=2000)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void buyLaptop(String brand,int serialNo,double price,int batteryCapacity,double screenSize,String os,int harddiskSize,int ramSize){
		System.out.println("Brand :"+brand);
		System.out.println("serialNo :"+serialNo);
		System.out.println("price :"+price);
		System.out.println("batteryCapacity :"+batteryCapacity);
		System.out.println("screenSize :"+screenSize);
		System.out.println("os :"+os);
		System.out.println("harddiskSize :"+harddiskSize);
		System.out.println("ramSize :"+ramSize);
		if(screenSize>19 && screenSize<=34)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}
	public static void buySmartWatch(String brand,double price,char color,char type,int mode){
		System.out.println("brand :"+brand);
		System.out.println("price :"+price);
		System.out.println("color :"+color);
		System.out.println("type :"+type);
		System.out.println("mode :"+mode);
		
		if(price>200 && price<=4000)
		{
		System.out.println("Is Valid");	
		}
		else
		{
			System.out.println("Is Inalid");	
		}
	}

	
}