import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void getDaysBetweenDates() throws ParseException {
        Date date1_1 = Main.validateAndParseDate("2023/03/04");
        Date date1_2 = Main.validateAndParseDate("2023/03/06");
        assertEquals(2, Main.getDaysBetweenDates(date1_1, date1_2));
        Date date2_1 = Main.validateAndParseDate("2023/03/30");
        Date date2_2 = Main.validateAndParseDate("2023/04/01");
        assertEquals(2, Main.getDaysBetweenDates(date2_1, date2_2));
    }

    @org.junit.jupiter.api.Test
    void validateAndParseDate() {
    }
}