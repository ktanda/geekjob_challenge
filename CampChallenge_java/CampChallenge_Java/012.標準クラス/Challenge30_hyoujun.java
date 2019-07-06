package challenge;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge30_hyoujun {
	public static void main(String[] args) {
		Date now = new Date();
		try {
			File fp = new File("log.txt");
			FileWriter fw = new FileWriter(fp);
	        SimpleDateFormat sdf =
	                new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
			fw.write(sdf.format(now)+" 開始\r\n");

			double a = 2.0;
			double b = 0.0;
			b = Math.sqrt(a);

			fw.write(b+"^2="+ a+"\r\n");

			fw.write(sdf.format(now)+" 終了");

			fw.close();

		}catch(IOException e) {
			e.getStackTrace();
		}

	}

}
