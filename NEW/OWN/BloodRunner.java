class BloodRunner{
	public static void main(String[] args)
	{
		System.out.println("Running in main class");
		String ref= Blood.group();
		String ref2= Blood.personName();
		double ref3 = Blood.cost();
		String ref4 = Blood.hospitalTested();
		boolean ref5 = Blood.sickness();
		boolean ref6 = Blood.donate();
	}
}