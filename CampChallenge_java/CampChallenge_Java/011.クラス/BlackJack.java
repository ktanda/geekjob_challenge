package camp.trial01;



public class BlackJack {

	public static void main(String[] args){
		User A = new User();
	    Dealer B = new Dealer();
	    int Ai=0;
	    int Bi=0;

	    B.shaffl();

	    A.setCard(B.deal());
	    System.out.println("A:"+A.myCards.get(0)+","+A.myCards.get(1));

	    B.setCard(B.deal());
	    System.out.println("Dealer:"+B.myCards.get(0)+","+B.myCards.get(1));

	    while(A.checkSum()){
	    A.setCard(B.hit());
	    System.out.println("A hits "+A.myCards.get(Ai+2));
	    Ai++;
	    }

	    System.out.println("A:"+A.open());
	    if(A.open()>21){
	    System.out.println("burst!!\nWinner:Dealer!!");
	    }else {

	    while(B.checkSum()){
	    B.setCard(B.hit());
	    System.out.println("Dealer hits "+B.myCards.get(Bi+2));
	    Bi++;
	    }

	    System.out.println("Dealer:"+B.open());
	    if(B.open()>21){
	    System.out.println("burst!!\nWinner:A!!");
	    }else {

	    if(A.open() > B.open()){
	    System.out.println("WINNER:A!!");
	    }else if(B.open()>A.open()){
	    System.out.println("WINNER:Dealer!!");
	    }else{
	    System.out.print("DRAW!!");
	    }
	    }
	}
	}

}
