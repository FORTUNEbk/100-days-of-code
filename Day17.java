import java.time.*;
import java.time.format.DateTimeFormatter;

public class Day17 {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        long epochTime = System.currentTimeMillis();
        System.out.println("Current Epoch Time: " + epochTime);

        LocalDate dateBefore7Days = currentDate.minusDays(7);
        System.out.println("Date 7 Days Before: " + dateBefore7Days);

        LocalDate anotherDate = LocalDate.of(2023, 1, 1);
        System.out.println("Another Date: " + anotherDate);

        if (currentDate.isBefore(anotherDate)) {
            System.out.println(currentDate + " is before " + anotherDate);
        } else {
            System.out.println(currentDate + " is not before " + anotherDate);
        }

        if (currentDate.isAfter(anotherDate)) {
            System.out.println(currentDate + " is after " + anotherDate);
        } else {
            System.out.println(currentDate + " is not after " + anotherDate);
        }

        int comparison = currentDate.compareTo(anotherDate);
        if (comparison < 0) {
            System.out.println(currentDate + " is before " + anotherDate + " (compareTo result: " + comparison + ")");
        } else if (comparison > 0) {
            System.out.println(currentDate + " is after " + anotherDate + " (compareTo result: " + comparison + ")");
        } else {
            System.out.println(currentDate + " is equal to " + anotherDate + " (compareTo result: " + comparison + ")");
        }

        ZonedDateTime currentDateTime = ZonedDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        ZonedDateTime gmtDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("GMT"));
        System.out.println("Current Date in GMT: " + gmtDateTime.format(formatter));

        ZonedDateTime cstDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("CST", ZoneId.SHORT_IDS));
        System.out.println("Current Date in CST: " + cstDateTime.format(formatter));

        ZonedDateTime istDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST: " + istDateTime.format(formatter));
    }
}
