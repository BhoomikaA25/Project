class PG{
	public static void info(String name, String address){
		System.out.println("parameters String and String ");
		System.out.println("Name :" +name);
		System.out.println("Address :" +address);
	}
	public static void info(int rooms, double price){
		System.out.println("parameters int and double ");
		System.out.println("No of rooms :" +rooms);
		System.out.println("price :" +price);
	}
    public static void info(int people, int sharing){
		System.out.println("parameters int and int ");
		System.out.println("No of people :" +people);
		System.out.println("sharing :" +sharing);
	}
	public static void info(int floors, boolean refrigerator){
		System.out.println("parameters int and boolean ");
		System.out.println("No of floors :" +floors);
		System.out.println("Is refrigerator :" +refrigerator);
	}
	public static void info(double distance, int security){
		System.out.println("parameters float and security ");
		System.out.println("Pg to cls dist :" +distance);
		System.out.println("num security :" +security);
	}
	
}