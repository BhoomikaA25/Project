class Keybunch{
	String material;
	Key key ;   //non primitive datatype
	
	public Keybunch(String material,Key key){
		this.material=material;
		this.key=key;
		
	}
	
	public void display()
	{
		System.out.println("the material is:" +material);
		System.out.println("Key :" +key);
		this.key.display();
	}

}