class Projector{
	String type="LCD";
  String company;
  String color;
  int weight;
		public void display()
	{
		System.out.println("company: "+company);
		System.out.println("color:" +color);
		System.out.println("weight:" +weight);
		
	}
	
	public Projector(String company, String color,int weight){
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Constructor created");
	}
	

	
	public void setProjector(String company, String color,int weight){
		this.company=company;
		this.color=color;
		this.weight=weight;
		System.out.println("Constructor created");
	}
}