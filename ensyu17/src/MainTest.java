import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void countWorkingDay()throws ParseException {
        assertEquals(4, DateUtill.countWorkingDays("2023/05/14","2023/05/18"));
        assertEquals(7, DateUtill.countWorkingDays("2023/05/19","2023/05/26"));
        assertEquals(7, DateUtill.countWorkingDays("2023/05/29","2023/06/06"));
        assertEquals(0, DateUtill.countWorkingDays("2023/05/29","2023/06/17"));
        assertEquals(0, DateUtill.countWorkingDays("2023/05/29","2023/06/24"));
        assertEquals(1, DateUtill.countWorkingDays("2023/05/29","2023/06/30"));
        assertEquals(1, DateUtill.countWorkingDays("2023/05/29","2023/07/04"));
        assertEquals(2, DateUtill.countWorkingDays("2023/05/29","2023/07/06"));
        assertEquals(20, DateUtill.countWorkingDays("2023/05/29","2023/07/19"));
    }
}