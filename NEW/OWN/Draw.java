class Draw{
	public static void market(byte age, short NoOfvegies){
		
		System.out.println("Age :" +age);
		
		System.out.println("Num of Vegies :" +NoOfvegies);
		
	}
	public static void vegetable(String name, double price, boolean isCostly){
		
		System.out.println("Name :" +name);
		
		
			if(price==100){
				System.out.println("Price :"+price);
				System.out.println("Vegies are costly");
			}
			else
			{
				System.out.println("Price:"+price);
			}
	}
	
	public static void main(String[] args){
		byte age =22;
		short NoOfvegies=56;
		String name ="Beans";
		double price = 100;
		boolean isCostly= true;
		market(age,NoOfvegies);
		vegetable(name,price,isCostly);
		
		
		
		
	}
	
}