package camp.trial01;

import java.util.ArrayList;
import java.util.Random;

class Dealer extends Human{
    protected ArrayList<Integer> cards = new ArrayList<Integer>();/*山札*/

    public void shaffl(){
    /*山札にカードを追加してシャッフル*/
    for(int i=1;i<=13;i++){
        for(int j=0;j<4;j++){
        	if(i>10) {
        		cards.add(10);
        	}else {
        cards.add(i);
        }
    }
    }
    }
    public ArrayList<Integer> deal(){
    /*山からカードを二枚引く*/
    Random rand = new Random();
    ArrayList<Integer> two = new ArrayList<Integer>();

    int a = rand.nextInt(cards.size());
    two.add(cards.get(a));
    cards.remove(a);

    int b = rand.nextInt(cards.size());
    two.add(cards.get(b));
    cards.remove(b);

    return two;
    }
    public ArrayList<Integer> hit(){
    /*山からカードを１枚引く*/
    Random rand = new Random();
    ArrayList<Integer> one = new ArrayList<Integer>();

    int a = rand.nextInt(cards.size());
    one.add(cards.get(a));
    cards.remove(a);

    return one;
    }
}

