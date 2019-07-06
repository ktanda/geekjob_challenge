package challenge;
import java.util.ArrayList;

public class Challenge20_hikimodo1 {
	static ArrayList<String> userprofile(int num){
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> b = new ArrayList<String>();
		ArrayList<String> c = new ArrayList<String>();

		a.add("1");
		a.add("Geektaro");
		a.add("Toyko");
		a.add("Man");
		a.add("Programer");

		b.add("2");
		b.add("Geekhanako");
		b.add("Hokkaido");
		b.add("Woman");
		b.add("Systemenginer");

		c.add("3");
		c.add("Geeksaburo");
		c.add("Osaka");
		c.add("Man");
		c.add("Webenginer");

		if(num == Integer.parseInt(a.get(0))) {
			return a;
		}else if(num == Integer.parseInt(b.get(0))) {
			return b;
		}else if(num == Integer.parseInt(c.get(0))) {
			return c;
		}else {
			return null;
		}

	}

	public static void main(String[] args) {
		int num = 1;
		ArrayList<String> x = new ArrayList<String>();

		x.addAll(userprofile(num));

		for(int i = 1;i<5;i++) {
			System.out.println(x.get(i));
		}
	}

}
