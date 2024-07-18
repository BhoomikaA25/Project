class BuyRunner{
	public static void main(String[] args){
		Buy.product("Lee",200);
		Buy.product("Lee",600);
		Buy.product("Nippon",10,"Premium",1000);
		Buy.product("Nippon",9,"Premium",-11500);
		Buy.bookMovieTicket("kalki","bharat cinema",2000,5000);
		Buy.bookMovieTicket("kalki","bharat cinema",10,5000);
		Buy.buyEgg(12,6);
		Buy.buyEgg(12,90);
		Buy.buyShampoo(200,200,"Dove","jun20");
		Buy.buyShampoo(990,250,"Dove","jun20");
		Buy.buyCake('S',"pastry","Chocolate",250,10);
		Buy.buyCake('S',"pastry","Chocolate",79000,10);
		Buy.buyLaptop("HP",101,60000,6000,30,"Windows",1,8);
		Buy.buyLaptop("HP",101,6000,6000,40,"Windows",1,8);
		Buy.buySmartWatch("Boat",1000,'R','D',5000);
		Buy.buySmartWatch("Boat",7000,'w','D',5000);
		
	}
}