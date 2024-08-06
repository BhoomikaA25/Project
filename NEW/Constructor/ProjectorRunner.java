class ProjectorRunner{
	public static void main(String[] args){
		Projector projector = new Projector("Epson","white",3);
	    projector.display();
		projector.setProjector("LG","white",3);
		projector.display();
		System.out.println();
		
		Projector projector1 = new Projector("Samsung","Black",3);
	    projector1.display();
		projector.setProjector("Epson","black",3);
		projector1.display();
		System.out.println();
		
		Projector projector2 = new Projector("Portonics","Grey",3);
	    projector2.display();
		projector.setProjector("LG","Greysss",3);
		projector2.display();
		System.out.println();
		
	}
}