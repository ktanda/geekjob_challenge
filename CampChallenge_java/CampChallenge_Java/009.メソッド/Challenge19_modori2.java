package challenge;
import java.util.ArrayList;

public class Challenge19_modori2 {
	static ArrayList<String> userprofile(){
		ArrayList<String> a = new ArrayList<String>();
		a.add("1");
		a.add("geektaro");
		a.add("Tokyo");
		a.add("Man");
		a.add("Programer");

		return a;

	}

	public static void main(String[] args) {
		ArrayList<String> b = new ArrayList<String>();
		b.addAll(userprofile());
		for(int i=1;i<=4;i++) {
			System.out.println(b.get(i));
		}
	}
}
