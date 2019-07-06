package challenge;

public class Challenge27_moji3 {
	public static void main(String[] args) {
		String word = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます" ;
		word = word.replace("I", "い");
		word = word.replaceAll("U", "う");
		System.out.println(word);
	}
}
