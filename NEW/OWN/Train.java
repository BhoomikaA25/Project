class Train{
    public static void book(String source, String destination)
	{
		System.out.println("parameters String and String ");
		System.out.println("Source :" +source); 
		System.out.println("Destination :" +destination);
	}	
	public static void book(String source, String destination, int quantity)
	{
		System.out.println("parameters String, String an int ");
		System.out.println("Source :" +source);
		System.out.println("Destination :" +destination);
		System.out.println("quantity :" +quantity);
	}	
	public static void book(String source, String destination, int quantity, double price)
	{
		System.out.println("parameters String, String, int and double ");
		System.out.println("Source :" +source);
		System.out.println("Destination :" +destination);
		System.out.println("quantity :" +quantity);
		System.out.println("Price :" +price);	
	}
    public static void cancel(int ticketNo){
		System.out.println("parameter int ");
		System.out.println("TicketNo :" +ticketNo);
		
	}	
	public static void cancel(String source,String destination){
		System.out.println("parameters String and String ");
		System.out.println("Source :" +source);
		System.out.println("Destination :" +destination);
	}
}