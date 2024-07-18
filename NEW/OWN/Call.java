class Call
{
	public static double picture
	(String medicineName)
	{
		System.out.println("running in method called price");
		System.out.println("medicineName:"+medicineName);
		if(medicineName=="Dolo650")
		{
			return 23;
		}
		if(medicineName=="Dolo250")
		{
			return 17;
		}
		if(medicineName=="Dolo350")
		{
			return 19;
		}
		
		return 21;
	}
	
	public static String work(String course)
	{
		System.out.println("running in method called name");
		System.out.println("course"+course);
		if(course=="Degree")
		{
			return "BE";
		}
		else
		{
			return "MBA";
		}
	}
	
	public static void picture()
	{
		int age = 19;
		String name = "Dangal";
		double ticketPrice =1000;
		System.out.println("age:"+age);
		System.out.println("name:"+name);
		if(age<18)
		{
			System.out.println(" age is below 19 ticketPrice is less than 1000");
			return;
		}
		else
		{
			System.out.println(" age is above 19 ticketPrice is 1000");
			return;
		}
	}
}