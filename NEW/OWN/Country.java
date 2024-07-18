class Country{
	public static void StateNames(String states){
		System.out.println("Start of the loop");
		 String[] names={"Andra Pradesh","Arunachal Pradesh", "Assam","Bihar","Chhattisgarh","Goa","Gujrat","Haryana","Himachal Pradesh",
							"Jammu and Kashmir","Jharkhand","Karnataka","Kerla","Madhya Pradesh","Maharashtra","Manipur","Meghalaya",
							"Mizoram","Nagaland","Orissa","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh",
							"Uttarkhand","West Bengal"};
		for(int start=0; start<names.length; start++){
			String ref =names[start]; 
			System.out.println("State names are"+ref);
		  }
	  }
}