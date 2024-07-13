//Example of encapsulation

public class Day24_Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    public Day24_Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("Book checked out: " + title);
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not checked out.");
        }
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Checked Out: " + isCheckedOut);
    }
}
