package camp.trial01;

import java.util.ArrayList;



public class Human {
	    protected ArrayList<Integer> myCards = new ArrayList<Integer>();/*手札*/

	    public int open(){
	    /*手札の合計*/
	    int sum=0;
	    for(int i=0;i<myCards.size();i++){
	        sum=sum+myCards.get(i);
	    }

	    return sum;
	    }
	    public void setCard(ArrayList<Integer> hiita){
	    /*引いたカードを手札にセット*/
	    for(int i=0;i<hiita.size();i++){
	        myCards.add(hiita.get(i));
	    }
	    }
	    public boolean checkSum(){
	    /*まだカードを引くならtrue*/
	    if(open()>17){
	        return false;
	    }else{
	        return true;
	    }
	    }

}





