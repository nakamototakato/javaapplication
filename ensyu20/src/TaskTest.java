import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void isExpired() throws ParseException {
        assertEquals(true, Task.isExpired("2023/06/28"));
        assertEquals(true, Task.isExpired("2023/07/12"));
        assertEquals(false, Task.isExpired("2023/05/30"));
        assertEquals(false, Task.isExpired("2023/04/01"));
    }
}