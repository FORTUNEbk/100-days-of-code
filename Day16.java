public class Day16{

    enum Weekdays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Print all elements in the enum
        for (Weekdays day : Weekdays.values()) {
            System.out.println(day);
        }
    }
}
