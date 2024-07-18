class DeliveryGuy{
	public static void deliver(String item){
		
		System.out.println("Delivery guy with the item ");
		DeliveryVehicle.deliver(item,"FIXED");
	}
}