class CallRunner
{
	public static void main(String[] args)
	{
		System.out.println("running in main method");
		double ref1=Call.cost("Dolo650");
		System.out.println("ref1:"+ref1);
		String ref2=Call.work("Degree");
		System.out.println("ref2:"+ref2);
		Call.picture();
	}
}