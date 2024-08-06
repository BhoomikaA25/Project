class Rocket{
   String country="India";
	float speed;
	String fuelCapacity;
	int noOfThrusters;
	
		public void display()
	{
		System.out.println("Speed name: "+speed);
		System.out.println("fuelCapacity:" +fuelCapacity);
		System.out.println("noOfThrusters:" +noOfThrusters);
		
	}
	
	public Rocket(float speed,String fuelCapacity,int noOfThrusters){
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
		this.noOfThrusters=noOfThrusters;
		System.out.println("Constructor created");
	}
	

	public void setRocket(float speed,String fuelCapacity,int noOfThrusters){
		this.speed=speed;
		this.fuelCapacity=fuelCapacity;
		this.noOfThrusters=noOfThrusters;
		System.out.println("class created");
		
	}
}