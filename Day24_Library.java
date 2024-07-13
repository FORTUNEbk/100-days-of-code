// Encapsulation

import java.util.ArrayList;
import java.util.List;

public class Day24_Library {
    private List<Day24_Book> books;
    private List<Day24_Member> members;

    public Day24_Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Day24_Book book) {
        books.add(book);
    }

    public void addMember(Day24_Member member) {
        members.add(member);
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (Day24_Book book : books) {
            book.displayInfo();
            System.out.println();
        }
    }

    public void listMembers() {
        System.out.println("Library members:");
        for (Day24_Member member : members) {
            member.displayInfo();
            System.out.println();
        }
    }
}
