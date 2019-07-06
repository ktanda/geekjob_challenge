package challenge;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge23_time3 {
    public static void main(String[] args) throws ParseException  {
        // SimpleDateFormat作成
        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        // Date取得
        Date day = sdf.parse("2016/11/04 10:00:00");
    }
}
