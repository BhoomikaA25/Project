class CategoryRunner{
     public static void main(String[] args){
		 System.out.println("Running Main Class");
		 if(medicine.length==4){
			 String name = args[0];
			 String manfDate=args[1];
			 String price = args[2];
			 String quality=args[3];
			 
			 int convertedMan= Integer.parseInt(manfDate);
			 double convertedPrice= Double.parseDouble(price);
			 int convertedQuality= Integer.parseInt(quality);
			 Category.medicineInformation(name,manfDate,price,quality);
			 
		 }
	 }	
	
}