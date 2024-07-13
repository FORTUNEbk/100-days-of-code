public class Day24_Main {
    public static void main(String[] args) {
        Day24_Library library = new Day24_Library();

        // We will use this here to add books
        Day24_Book book1 = new Day24_Book("Computer Architecture", "Mushiri Nyaga");
        Day24_Book book2 = new Day24_Book("Algorithm design", "Ndinda Wilkister");
        library.addBook(book1);
        library.addBook(book2);

        //We use this to add members
        Day24_Member member1 = new Day24_Member("Alice", 1);
        Day24_Member member2 = new Day24_Member("Bob", 2);
        library.addMember(member1);
        library.addMember(member2);

        // List books and members
        library.listBooks();
        library.listMembers();

        // Borrow and return books
        member1.borrowBook(book1);
        member1.returnBook(book1);

        // Check borrowing a book that's already borrowed
        member2.borrowBook(book1);
        member1.borrowBook(book1);
    }
}
