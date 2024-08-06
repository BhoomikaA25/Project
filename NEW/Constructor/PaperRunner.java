class PaperRunner{
	public static void main(String[] args){
		Paper paper = new Paper(0.05,1,"White");
	    paper.display();
		paper.setPaper(0.10,1,"Green");
		paper.display();
		System.out.println();
		
		Paper paper1 = new Paper(0.05,1,"Black");
		
		
		
	    paper1.display();
		paper1.setPaper(0.10,1,"White");
		paper1.display();
		System.out.println();
		
		Paper paper2 = new Paper(0.05,1,"red");
	    paper2.display();
		paper2.setPaper(0.15cfxr,1,"Blue");
		paper2.display();
		System.out.println();
		
	}
}