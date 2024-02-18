import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Testing3 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String formattedDate = formatDate(date);

        System.out.println(formattedDate);
    }

    static String formatDate(OffsetDateTime date) {
        if(date == null) {
            return null;
        }
        return date.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}
