class Lap{
	
	 static double hpPrice=40000;
		static double delPrice=42000;
		static double lenevoPrice=46000;
		static double macPrice=88000;
		static double keyPrice= 5000;
		static double mousePrice=6000;
		 
		
		public static double check(String name,boolean offer)
		{
		double totalPrice=0;	
			if(name=="HP" ){
				if(offer==true){
				double totalPrice=hpPrice-mousePrice;
				System.out.println("offer mouse price is : " +mousePrice);
				System.out.println("The total price with offer is:"+totalPrice);
				 
				return totalPrice;
				}
				else{
					totalPrice=hpPrice;
					return totalPrice;
				}
			}
			
			
			
			
		if(name=="Del" ){
				if(offer==true){
					
				double totalPrice=delPrice-keyPrice;
				System.out.println("offer keyboard price is : " +keyPrice);
				System.out.println("The total price with offer is:"+totalPrice);
				 
				return totalPrice;
				}else{
					totalPrice=delPrice;
					return totalPrice;
				}
			}
		
		
		
		
			if(name=="Lenevo" ){
				if(offer==true){
				double tPrice=keyPrice+mousePrice;
				double totalPrice=lenevoPrice-tPrice;
				System.out.println("offer keyboard with Mouse price is : " +tPrice);
				System.out.println("The total price with offer is:"+totalPrice);
				 
				return totalPrice;
				}else{
					totalPrice=lenevoPrice;
					return totalPrice;
				}
			}
		
			
			
			if(name=="Mac" ){
				if(offer==false){
				
				System.out.println("The total price 
				is:"+macPrice);
				 
				return totalPrice;
				}
				else{
					System.out.println("No offer" );
				}
				
				
			}return totalPrice;
		}
		
			
			
		
		
		
		
	public static void main(String[] args){
		
		Lap.check("Mac",true);
		
		
	}

}
		
		
	
	

	

