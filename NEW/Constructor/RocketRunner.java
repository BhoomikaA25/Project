class RocketRunner{
	public static void main(String[] args){
		Rocket rocket = new Rocket(27000,"1600Kg to 2500kg",5);
	    rocket.display();
		rocket.setRocket(27000,"4000kg",4);
		rocket.display();
		System.out.println();
		
		Rocket rocket1 = new Rocket(4789,"1500kg",4);
		rocket.display();
		rocket.setRocket(37000,"2000kg",4);
		rocket1.display();
		System.out.println();
		
		Rocket rocket2 = new Rocket(27000,"2500kg",5);
		rocket2.display();
		rocket2.setRocket(2300,"1600Kg",4);
		rocket2.display();
		System.out.println();
		
		
	}
}