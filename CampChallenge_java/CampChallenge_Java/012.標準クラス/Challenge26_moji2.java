package challenge;

public class Challenge26_moji2 {
	public static void main(String[] args) {
		String adress = "kuetyfaihuf@gmail.com";
		int i = adress.indexOf("@");
		
		System.out.println(adress.substring(i+1).length());
		
	}

}
