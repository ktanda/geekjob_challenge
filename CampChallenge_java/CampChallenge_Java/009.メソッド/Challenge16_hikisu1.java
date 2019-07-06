package challenge;

public class Challenge16_hikisu1 {
	static void judge(int num) {
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {
		int num = 5;
		judge(num);
	}

}
