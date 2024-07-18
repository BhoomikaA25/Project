class GalanometerRunner{

			public static void main(String[] palace){
		System.out.println("Information of palace");
		if(palace.length==4){
			String name=palace[0];
			String location =palace[1];
			String builtBy=palace[2];
			int buildYear=1945;
			String ref=buildYear+palace[3];
			System.out.println("name :"+name);
			System.out.println("location :"+location);
			System.out.println("builtBy :"+builtBy);
			System.out.println("buildYear :"+buildYear);
		}
		else{
			System.out.println("The info is not enough to print in console ");
		}
	}

}