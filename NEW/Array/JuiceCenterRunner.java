class JuiceCenterRunner{
	public static void main(String[] args){
		if(args.length==5){
			 String name = args[0];
			 String brand=args[1];
			 String flavour = args[2];
			 String price=args[3];
			 String quality=args[4];
			 
			 double convertedPrice= Double.parseDouble(price);
			 int convertedQuality= Integer.parseInt(quality);
			 JuiceCenter.juice(name,brand,flavour,convertedPrice,convertedQuality);
			 
		 }
		 else{
			 System.out.println("The information are not enough");
		 }
	 }	
	
			
}