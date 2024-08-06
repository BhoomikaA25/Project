class SpeakerRunner{
	public static void main(String[] args){
		Speaker speaker = new Speaker("Sony",4000,"Best sound capacity");
	    speaker.display();
		speaker.setSpeaker("JBL",7000,"Hearing Capacity");
		speaker.display();
		System.out.println();
		
		Speaker speaker1 = new Speaker("Boat",5000,"Adaptive noise");
		speaker1.display();
		speaker1.setSpeaker("Boat",5000,"Best sound capacity");
		speaker1.display();
		System.out.println();
		
		Speaker speaker2 = new Speaker("JBL",8000,"Good Power Capacity");
		speaker2.display();
		speaker2.setSpeaker("Boat",4500,"Best sound capacity");
		speaker2.display();
		System.out.println();
		
		
	}
}