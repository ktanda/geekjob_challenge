package challenge_class1;

public class Class1 {
	public String name = "";
	public int age = 0;
	public String adress = "";

	public void setprofile(String a, int b, String c) {
		this.name = a;
		this.age = b;
		this.adress = c;
	}

	public void printprofile() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.adress);
	}
}
