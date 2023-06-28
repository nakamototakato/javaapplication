import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static String getNextWeek(String date) throws ParseException{
        Calendar dateCal = getCalendarFor(date); //getCalendarForで(data)はCalendar型になってる
        int n = 1;
        Calendar trialCal = (Calendar) dateCal.clone(); //cloneでdateCalをtrialCalにコピーする
        trialCal.add(Calendar.DAY_OF_MONTH, n);  //trialCalの日付けの場所にnを加算する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");  //SimpleDateFormatをsdfに設定する
        String formattedDate = sdf.format(trialCal.getTime());  //trialCalの日付けをformatでsdfの型にして、formattedDateに入れる
        while (isSaturdayOrSunday(formattedDate)) {  //formattedDateが土か日ならwhileに入る
            trialCal.add(Calendar.DAY_OF_MONTH, 1);  //trialCalの日付けの場所に1を加算する
            sdf = new SimpleDateFormat("yyyy/MM/dd");  //SimpleDateFormatをsdfに設定する
            formattedDate = sdf.format(trialCal.getTime());  //trialCalの日付けをformatでsdfの型にして、formattedDateに入れる
        }
        return formattedDate;
    }

    public static int countWorkingDays(String from, String to) throws ParseException {
        String[] daysStrings = getDaysStrBetween(from, to);
        int count = 0;
        for (int i = 0; i < daysStrings.length; i++) {
            if(!isSaturdayOrSunday(daysStrings[i]))
                count++;
        }
        return count;
    }

    public static String[] getDaysStrBetween(String from, String to) throws ParseException{
        Calendar fromC = getCalendarFor(from);                                                  //フォーマット変換
        Calendar toC = getCalendarFor(to);                                                      //    "
        int howManyDays = DateUtil.countDaysBetween(fromC.getTime(), toC.getTime()) + 1;
        String[] strings = new String[howManyDays];
        int n = 0;
        while (n != howManyDays) {
            Calendar tmp = (Calendar) fromC.clone();
            tmp.add(Calendar.DAY_OF_MONTH, n);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String formattedDate = sdf.format(tmp.getTime());
            strings[n] = formattedDate;
            n++;
        }
        return strings;
    }

    public static int countDaysBetween(Date date1, Date date2) {            //時間を日付になおしている
        long difference = date2.getTime() - date1.getTime();
        return (int) ( difference / (24 * 60 * 60 * 1000));
    }

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

    public static Calendar getCalendarFor(String yyyymmdd) throws ParseException {
        final Date date = DateUtil.validateAndParseDate(yyyymmdd);
        final Calendar calendar = Calendar.getInstance(); //getInstanceで現在時刻を取得してcalendarに入れる
        calendar.setTime(date); //Date型のdateをsetTimeでCalendar型にしてcalendarに入れる
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