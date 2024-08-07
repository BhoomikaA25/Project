class keyRunner{
	public static void main(String[] args){
		
		System.out.println("Started Class runner");
		Key key = new Key("Epson" ,50 );
		Keybunch keybunch = new Keybunch("Wooden",key);
		keybunch.display();
		System.out.println("end Class runner");

		
	}
}