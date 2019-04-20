package camp.trial01;

public class Level18 {
	public static void main(String[] args) {
		/*
		 * 【課題18】
		 *条件分岐と組み合わせて、1から40の間にある偶数だけ表示しよう！
		 */
		//ここから

		for(int i=1;i<=40;i++) {
			if( i % 2 == 0) {
				System.out.println("i の数字は" + i + "です");
			}
		}

		//ここまで

	}
}
