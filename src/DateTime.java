import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime cDateTime = LocalDateTime.now();
        System.out.println(cDateTime);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm , dd/MM/yyyy");
        System.out.println(dateTimeFormatter);
    }
}

