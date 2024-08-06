class Paper{
   double thickness;
  String size="A4";
 int quality;
  String color;
		public void display()
	{
		System.out.println("thickness: "+thickness);
		System.out.println("size:" +quality);
		System.out.println("quality:" +color);
		
	}
	
	public Paper(double thickness,  int quality,String color){
		this.thickness=thickness;
		this.quality=quality;
		this.color=color;
		System.out.println("Constructor created");
	}
	

	public void setPaper(double thickness,  int quality,String color){
		this.thickness=thickness;
		this.quality=quality;
		this.color=color;
		System.out.println("Constructor created");
	}
}