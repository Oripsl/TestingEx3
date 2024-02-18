import org.junit.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Testing3Test {


    @Test
    public void testDateShort() {
        OffsetDateTime date = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        String toTestDate = Testing3.formatDate(date);
        String expectedDate = date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        assertEquals(expectedDate, toTestDate);
    }

    @Test
    public void testDateShortNull() {
        String toTestDate = Testing3.formatDate(null);
        assertNull(toTestDate);
    }

}