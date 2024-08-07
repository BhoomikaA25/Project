class Key
{
	String brand;
	double weight;

	public Key(String brand,double weight)
	{
		this.brand=brand;
		this.weight=weight;
	}

	public void display()
	{
		System.out.println("the brand is:"+brand);
		System.out.println("the weight is:"+weight);

	}
}