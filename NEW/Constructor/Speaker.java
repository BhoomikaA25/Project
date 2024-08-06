class Speaker{
    int size=10;
	String brand;
	double cost;
	String output;
	
		public void display()
	{
		System.out.println("Brand name: "+brand);
		System.out.println("Cost:" +cost);
		System.out.println("Output:" +output);
		
	}
	
	public Speaker(String brand,double cost,String output){
		this.brand=brand;
		this.cost=cost;
		this.output=output;
		System.out.println("Constructor created");
	}
	

	public void setSpeaker(String brand,double cost,String output){
		this.brand=brand;
		this.cost=cost;
		this.output=output;
		System.out.println("class created");
		
	}
}