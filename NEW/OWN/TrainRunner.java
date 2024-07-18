class TrainRunner{
	public static void main(String[] args){
		Train.book("Shimoga","Banglore");
		Train.book("Shimoga","Banglore",6);
		Train.book("Shimoga","Banglore",6,140.7);
		Train.cancel(67);
		Train.cancel("Shimoga","Banglore");
	}
}