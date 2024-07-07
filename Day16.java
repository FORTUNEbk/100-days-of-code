public class Day16{

    enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        for (Weekday day : Weekday.values()) {
            System.out.println(day);
        }
    }
}
