class Files1{
	public static void main(String[] args){
	System.out.println("Files used to store the info");
	 // invoke
	Files.hide();
	
	}
public static void hide(){
	System.out.println("Files can be hidden");
	name();
	storage();
}
public static void name(){
	System.out.println("Files set with name");
	hide();
	storage();
}
public static void storage(){
	System.out.println(" Files with storage");
	name();
	hide();
	
}

	}