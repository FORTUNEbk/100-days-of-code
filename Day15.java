import java.util.ArrayList;
import java.util.Collections;

public class Day15 {
    
    public static void main(String[] args) {
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");

        System.out.println("Original weekdays list: " + weekdays);

        Collections.sort(weekdays); // hii expression collection.sort () ina tumika ku sort data in the array weekdays.
        System.out.println("Weekdays list sorted in increasing order: " + weekdays);

        Collections.sort(weekdays, Collections.reverseOrder());// inside the  expression  collection.sort() tun ogeza ndani another expression called Collection.reverseOrder() to instract the program to sort in decreasing order.
        System.out.println("Weekdays list sorted in decreasing order: " + weekdays);

        char removeChar = 'T';
        removeElementsStartingWith(weekdays, removeChar);
        System.out.println("Weekdays list after removing elements starting with '" + removeChar + "': " + weekdays);
    }

    public static void removeElementsStartingWith(ArrayList<String> list, char startChar) {
        list.removeIf(day -> day.charAt(0) == startChar); //-> symbol separates the parameters of the lambda expression from the body. Andreah hope ume elewa hiyo.
    }
}
