class Chocolate{
   String brand= "Cadbery";
   float price;
   String flavour;
   double size;
		public void display()
	{
		System.out.println("pricee: "+price);
		System.out.println("flavour:" +flavour);
		System.out.println("size:" +size);
		
	}
	
	public Chocolate(float price, String flavour,double size){
		this.price=price;
		this.flavour=flavour;
		this.size=size;
		System.out.println("Constructor created");
	}
	

	public void setChocolate(float price, String flavour,double size){
		this.price=price;
		this.flavour=flavour;
		this.size=size;
		System.out.println("Constructor created");
	}
}