package challenge;

public class Challenge18_modori1 {
	static int calculation() {
		int num = 5 * 3;
		return num;
	}

	public static void main(String[] args) {
		int num = calculation();

		if(num>=200) {
			System.out.print("２００以上");
		}else if(num>=100) {
			System.out.print("１００以上２００未満");
		}else {
			System.out.println("１００未満");
		}
	}
}
