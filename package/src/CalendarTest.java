import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH);
        int date = today.get(Calendar.DATE);
        System.out.println(year+"년"+(month+1)+"월"+date);
        int hour = today.get(Calendar.HOUR);
        int hour24 = today.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour+"==="+hour24);
        int min = today.get(Calendar.MINUTE);
        int sec = today.get(Calendar.SECOND);
        System.out.println(hour+":"+min+":"+sec);
        int era = today.get(Calendar.ERA);  // 1 : ad  0:bc
        System.out.println(era);

        int apm = today.get(Calendar.AM_PM);
        System.out.println(apm==1?"PM":"AM");
        int dayOfYear = today.get(Calendar.DAY_OF_YEAR);
        int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        //sun = 1,mon = 2, wed = 3, tue = 4
        System.out.println(dayOfYear+"==="+dayOfMonth+"==="+dayOfWeek);

        today.set(2024,2,27);
        Date now = today.getTime();  // Calendar를 Date로 바꿔서 넣어야 한다.
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("YYYY/MM/dd");
        String str = simpleDateFormat.format(now);
        System.out.println(str);

        DateFormat dateFormat =new SimpleDateFormat("yyyy년 MM월 dd일");
        String frontDate = "2024년 3월 27일";
        //SimpleDateFormat은 매개변수로 Date만 받는다.
        //예외처리해야함...
        try {
            Date now02 = dateFormat.parse(frontDate);
            System.out.println(simpleDateFormat.format(now02));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
