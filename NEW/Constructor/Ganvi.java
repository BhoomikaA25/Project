class Ganvi{
	String email;
	Clip clip;
	
	public Ganvi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
		
	}
	
	public void display(){
		System.out.println("Email :" +email);
		System.out.println("Clip" +clip);
		this.clip.display();
	}
}