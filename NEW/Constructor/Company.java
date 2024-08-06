class Company{
	int id = 722;
	String name="BOSCH";
	String location="WILLSON GARDEN";
	
    SoftwareEngineer softwareEngineer = new SoftwareEngineer("Mehek",1,"Software Dev",80000.50);
	
	public void display(){
		System.out.println("id :" +id);
		System.out.println("name :" +name);
				System.out.println("location :" +location);		
				this.softwareEngineer.display();
		
	}
	
	
	
}