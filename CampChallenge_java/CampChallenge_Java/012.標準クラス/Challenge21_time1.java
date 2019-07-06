package challenge;
import java.util.Calendar;

public class Challenge21_time1 {
	public static void main(String[] args) {
		 Calendar c = Calendar.getInstance();
		 c.set(2016, 0, 1, 0, 0, 0);
		 System.out.println(c.getTime());
	}
}
