//Another example of encapsulation

public class Day24_Member {
    private String name;
    private int memberId;

    public Day24_Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Day24_Book book) {
        book.checkOut();
    }

    public void returnBook(Day24_Book book) {
        book.returnBook();
    }

    public void displayInfo() {
        System.out.println("Member Name: " + name);
        System.out.println("Member ID: " + memberId);
    }
}
