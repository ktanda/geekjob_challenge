package challenge;
import java.util.Calendar;

public class Challenge24_time4 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Calendar d = Calendar.getInstance();
		c.set(2015,0,1,0,0,0);
		d.set(2015,11,31,23,59,59);
		System.out.println(d.getTime()-c.getTime());
	
	}
}
