import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();

        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));

        System.out.println(simpleDateFormat.format(date));
    }
}