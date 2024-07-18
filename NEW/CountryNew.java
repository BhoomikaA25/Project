class CountryNew{
	public static void StateNames(String states){
		System.out.println("Method running in class CountryNew");
		String[] names={"Jammu and kashmir","Himachal Pradesh","Punjab","Haryana","Uttarakhand","Rajasthan",
		"Uttar pradesh","Bihar","Sikkim","Meghalaya","Assam","Arunachal pradesh","Telangana","Gujurath",
		"Madhya Pradesh","Chhattisgarh","Jharkhand","West Bengal","Tripura","Mizoram","Manipur","Nagaland",
		"Maharastra","Odisha","Goa","Andra Pradesh","Karnataka","Kerala","Tamil Nadu"};
		for(int start=0; start<names.length; start++){
			String ref=names[start];
			System.out.println("State names are"+ ref);
			
		}
		
	}
}