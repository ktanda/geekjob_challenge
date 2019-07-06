package challenge;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge22_time2 {
	public static void main(String[] args) {
		Date now = new Date();
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");

            System.out.print(sdf.format(now));
	}

}
