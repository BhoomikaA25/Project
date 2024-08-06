class Hotel{
	String name="Hotel Sagar";
	Owner owner = new Owner("Sheethal",29,'F');
	
	public void display()
	{
		System.out.println("Runs in the hotel");
		System.out.println("Hotel name is :"+this.name);
		this.owner.display();
	}	
}