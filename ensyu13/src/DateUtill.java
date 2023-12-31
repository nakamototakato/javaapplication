import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtill {
    /*public static boolean isSaturdayOrSunday(String yyyymmdd) throws ParseException{
        final Calendar calendar = getCalendarFor(yyyymmdd);
        final int SATURDAY_CODE = 7;
        final int SUNDAY_CODE = 1;
        final int dayOfWeekCode = calendar.get(Calendar.DAY_OF_WEEK);
        if(SATURDAY_CODE == dayOfWeekCode || dayOfWeekCode == SUNDAY_CODE ) {
            return true;
        } else {
            return false;
        }
    }*/ //コレでもできる。

    public static boolean isWeekDay(String yyyymmdd) throws ParseException {
        final Calendar calendar = getCalendarFor(yyyymmdd);
        final int MONDAY_CODE = 2;
        final int FRIDAY_CODE = 6;
        final int dayOfWeekCode = calendar.get(Calendar.DAY_OF_WEEK);
        if(MONDAY_CODE <= dayOfWeekCode && dayOfWeekCode <= FRIDAY_CODE ) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isSaturdayOrSunday(String yyyymmdd) throws ParseException{
        return !isWeekDay(yyyymmdd);
    }

    private static Calendar getCalendarFor(String yyyymmdd) throws ParseException {
        final Date date = DateUtill.validateAndParseDate(yyyymmdd);
        final Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }
    public static Date validateAndParseDate(String inputDate) throws ParseException {
        if (!inputDate.matches("^\\d{4}/\\d{2}/\\d{2}$")) {
            throw new ParseException("Invalid date format", 0);
        }
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        sdf.setLenient(false);

        return sdf.parse(inputDate);
    }
}