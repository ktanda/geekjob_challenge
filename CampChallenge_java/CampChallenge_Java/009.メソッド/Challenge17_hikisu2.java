package challenge;

public class Challenge17_hikisu2 {
	static void multiplication(int a,int b,boolean c) {
		int num =0;
		num = a*b;
		if(c == true) {
			num = num*num;
		}
		System.out.println(num);

	}

	static void multiplication(boolean a) {
		multiplication(1,1,a);
	}

	public static void main(String[] args) {
		multiplication(2,5,false);

		multiplication(true);
	}

}