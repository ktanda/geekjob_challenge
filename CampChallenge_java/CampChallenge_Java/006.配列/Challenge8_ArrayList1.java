package challenge;
import java.util.ArrayList;

public class Challenge8_ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("10");
		a.add("100");
		a.add("soeda");
		a.add("hayashi");
		a.add("-20");
		a.add("118");
		a.add("END");

		for(int i=0;i<7;i++) {
			System.out.println(a.get(i));
		}
	}

}
