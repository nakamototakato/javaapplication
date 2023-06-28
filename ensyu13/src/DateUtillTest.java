import org.junit.Test;

import java.text.ParseException;

import static junit.framework.TestCase.assertEquals;
class DateUtillTest {
    @Test
    void isSaturdayOrSunday() throws ParseException {
        assertEquals(true, DateUtill.isSaturdayOrSunday("2023/05/05"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/06"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/07"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/08"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/09"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/10"));
        assertEquals(true, DateUtill.isSaturdayOrSunday("2023/05/11"));
        assertEquals(true, DateUtill.isSaturdayOrSunday("2023/05/12"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/13"));
        assertEquals(false, DateUtill.isSaturdayOrSunday("2023/05/14"));
        assertEquals(true, DateUtill.isSaturdayOrSunday("2023/05/15"));
        assertEquals(true, DateUtill.isSaturdayOrSunday("2023/05/16"));
    }

    @org.junit.jupiter.api.Test
    void testIsSaturdayOrSunday() {
    }

    @org.junit.jupiter.api.Test
    void validateAndParseDate() {
    }
}