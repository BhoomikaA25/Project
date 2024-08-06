class ChocolateRunner{
	public static void main(String[] args){
		Chocolate chocolate = new Chocolate(190,"choclate",3.2);
	    chocolate.display();
		chocolate.setChocolate(250,"Oreo",3.2);
		chocolate.display();
		System.out.println();
		
		Chocolate chocolate1 = new Chocolate(150,"Bubbly",3.2);
	    chocolate1.display();
		chocolate.setChocolate(80,"Fruit and Nuts",3.2);
		chocolate1.display();
		System.out.println();
		
		Chocolate chocolate2 = new Chocolate(90,"Roasted Almonds",3.2);
	    chocolate2.display();
		chocolate.setChocolate(250,"Caremel",3.2);
		chocolate2.display();
		System.out.println();
		
	}
}