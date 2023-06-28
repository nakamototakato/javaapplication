import java.text.ParseException;
import java.util.Calendar;

public class Task {
    private String date;

    public static boolean isExpired(String date) throws ParseException{
        Calendar calendar = Calendar.getInstance(); //getInstanceで現在時刻を取得してcalendarに入れる
        Calendar due = DateUtil.getCalendarFor(date); //isExpiredのテストの値をgetCalendarForでyyyymmddの型にする
        int howManyDays = DateUtil.countDaysBetween(calendar.getTime(), due.getTime()) + 1;
        if (0 <= howManyDays) {
            return true;
        }else{
            return false;
        }
    }

}