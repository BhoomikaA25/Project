class CountryNew{
	public static void stateNames(String states){
		System.out.println("\nMethod running in class CountryNew\n");
		String[] names={"Jammu and kashmir","Himachal Pradesh","Punjab","Haryana","Uttarakhand","Rajasthan",
		"Uttar pradesh","Bihar","Sikkim","Meghalaya","Assam","Arunachal pradesh","Telangana","Gujurath",
		"Madhya Pradesh","Chhattisgarh","Jharkhand","West Bengal","Tripura","Mizoram","Manipur","Nagaland",
		"Maharastra","Odisha","Goa","Andra Pradesh","Karnataka","Kerala","Tamil Nadu"};
		for(int start=0; start<names.length; start++){
			String ref=names[start];
			System.out.println("State names are: "+ ref);
			
		}
		
		
	}
	public static void stateNamesBackward(String states){
		System.out.println("\nMethod running in class CountryNew\n");
		String[] names={"Jammu and kashmir","Himachal Pradesh","Punjab","Haryana","Uttarakhand","Rajasthan",
		"Uttar pradesh","Bihar","Sikkim","Meghalaya","Assam","Arunachal pradesh","Telangana","Gujurath",
		"Madhya Pradesh","Chhattisgarh","Jharkhand","West Bengal","Tripura","Mizoram","Manipur","Nagaland",
		"Maharastra","Odisha","Goa","Andra Pradesh","Karnataka","Kerala","Tamil Nadu"};
		for(int start=names.length-1; start>=0; start--){
			String ref=names[start];
			System.out.println("State names are: "+ ref);
			
		}
		
		
	}
	public static void pin(int code){
		System.out.println("\nMethod running in class CountryNew\n");
		int[] pincodes={577528,577204,577506,530068,560001,560002,560003,564398,568765,562367};
		for(int start=0;start<pincodes.length;start++){
			int ref1= pincodes[start];
			System.out.println("pincodes are: "+ ref1);
		}
	}
	
	public static void pinBackword(int code){
		System.out.println("\nMethod running in class CountryNew\n");
		int[] pincodes={577528,577204,577506,530068,560001,560002,560003,564398,568765,562367};
		for(int start=pincodes.length-1;start>=0;start--){
			int ref1= pincodes[start];
			System.out.println("pincodes are: "+ ref1);
		}
	}
	
	
	public static void primeminister(String mini){
		System.out.println("\n Method running in class CountryNew\n");
		String [] PM={"Jawaharlal Nehru","Gulzarilal nanda","Lal Bahadur Shastri","Indira gandhi",
		"Morarji Desai","Charan singh","rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar",
		"P V Narasimha Rao","Atal Bihari Vajpayee","H D Deve Gowda","Inder kumar Gujaral","Manamohan Singh",
		"Narendra Modi"};
		
		for(int start=0;start<PM.length; start++){
			System.out.println("start of the loop");
			String ref= PM[start];
			System.out.println("PrimeMinisters include: "+ ref);
		}
		System.out.println("End of the loop");
	}
	
	
	public static void primeministerBackword(String mini){
		System.out.println("\n Method running in class CountryNew\n");
		String [] PM={"Jawaharlal Nehru","Gulzarilal nanda","Lal Bahadur Shastri","Indira gandhi",
		"Morarji Desai","Charan singh","rajiv Gandhi","Vishwanath Pratap Singh","Chandra Shekhar",
		"P V Narasimha Rao","Atal Bihari Vajpayee","H D Deve Gowda","Inder kumar Gujaral","Manamohan Singh",
		"Narendra Modi"};
		
		for(int start=PM.length-1;start>=0; start--){
			System.out.println("start of the loop");
			String ref= PM[start];
			System.out.println("PrimeMinisters include: "+ ref);
		}
		System.out.println("End of the loop");
	}
	

	
	public static void cabinetMinisters(String Cabinetmini){
		System.out.println("\n Method running in class CountryNew\n");
		String[] Ministers={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin jairam Gadkari",
		"smt.Nirmala Sitaraman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda",
		"Shri Manohar Lal","Shri H D Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra pradhan","Shri Jitan Ram Manjhi",
		"Shri rajiv Ranjan Singh Alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Pralhad Joshi",
		"Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M Scindia","Shri Bhupender Yadav",
		"Shri Gajendra Singh Shekhawat","smt Annapurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri",
		"Dr. Mansukh Mandaviya","Shri G Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		
		for(int start=0;start<Ministers.length; start++){
			String ref= Ministers[start];
			System.out.println("Ministers include: "+ ref);
		}
		
	}
	
	public static void cabinetMinistersBackword(String Cabinetmini){
		System.out.println("\n Method running in class CountryNew\n");
		String[] Ministers={"Shri Rajnath Singh","Shri Amit Shah","Shri Nitin jairam Gadkari",
		"smt.Nirmala Sitaraman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda",
		"Shri Manohar Lal","Shri H D Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra pradhan","Shri Jitan Ram Manjhi",
		"Shri rajiv Ranjan Singh Alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Pralhad Joshi",
		"Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M Scindia","Shri Bhupender Yadav",
		"Shri Gajendra Singh Shekhawat","smt Annapurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri",
		"Dr. Mansukh Mandaviya","Shri G Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
		
		for(int start=Ministers.length-1;start>=0; start--){
			String ref= Ministers[start];
			System.out.println("Ministers include: "+ ref);
		}
		
	}
	
	public static void politicalParties(String politics){
		System.out.println("\n Method running in class CountryNew\n");
		String[] Parties={"Bharatiya Janatha Party","Indian National Congress","Aam Aadmi Party",
		"National Peoples party","Communist party of India"};
		
		for(int start=0;start<Parties.length; start++){
			String ref= Parties[start];
			System.out.println("Parties include: "+ ref);
		}
		
	}
	
	public static void politicalPartiesBackword(String politics){
		System.out.println("\n Method running in class CountryNew\n");
		String[] Parties={"Bharatiya Janatha Party","Indian National Congress","Aam Aadmi Party",
		"National Peoples party","Communist party of India"};
		
		for(int start=Parties.length-1;start>=0; start--){
			String ref= Parties[start];
			System.out.println("Parties include: "+ ref);
		}
		
	}
}