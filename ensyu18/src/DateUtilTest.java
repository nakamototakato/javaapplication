import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class DateUtilTest {

    @org.junit.jupiter.api.Test
    void getNextWeek() throws ParseException {
        assertEquals("2023/01/02", DateUtil.getNextWeek("2022/12/31"));
        assertEquals("2023/01/02", DateUtil.getNextWeek("2023/01/01"));
        assertEquals("2023/01/03", DateUtil.getNextWeek("2023/01/02"));
        assertEquals("2023/01/04", DateUtil.getNextWeek("2023/01/03"));
        assertEquals("2023/01/09", DateUtil.getNextWeek("2023/01/06"));
        //assertEquals("2023/06/28", DateUtil.getNextWeek("2023/06/20"));
        //assertEquals("2023/07/02", DateUtil.getNextWeek("2023/06/30"));
        //assertEquals("2023/06/15", DateUtil.getNextWeek("2023/06/14"));
    }

    @org.junit.jupiter.api.Test
    void countWorkingDays() {
    }

    @org.junit.jupiter.api.Test
    void getDaysStrBetween() {
    }

    @org.junit.jupiter.api.Test
    void countDaysBetween() {
    }

    @org.junit.jupiter.api.Test
    void isWeekDay() {
    }

    @org.junit.jupiter.api.Test
    void isSaturdayOrSunday() {
    }

    @org.junit.jupiter.api.Test
    void validateAndParseDate() {
    }
}