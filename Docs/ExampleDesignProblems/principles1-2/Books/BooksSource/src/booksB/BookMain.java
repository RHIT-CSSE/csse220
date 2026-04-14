package booksB;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    List<Kid> kids = new ArrayList<>();
    List<Book> books = new ArrayList<>();

    void handleNewReading(String bookName, String kidName) {
        Kid kid = findOrCreateKid(kidName);
        Book book = findOrCreateBook(bookName);

        kid.addBook(book);
        book.addKid(kid);
    }

    void handlePrintReportForKid(String kidName) {
        Kid kid = findKidByName(kidName);
        if (kid != null) {
            kid.printReport();
        } else {
            System.out.println("No such kid: " + kidName);
        }
    }

    void handlePrintReportForBook(String bookName) {
        Book book = findBookByName(bookName);
        if (book != null) {
            book.printReport();
        } else {
            System.out.println("No such book: " + bookName);
        }
    }


    private Kid findOrCreateKid(String kidName) {
        Kid kid = findKidByName(kidName);
        if (kid == null) {
            kid = new Kid();
            kid.name = kidName;
            kid.gradeLevel = "unknown";
            kids.add(kid);
        }
        return kid;
    }

    private Book findOrCreateBook(String bookName) {
        Book book = findBookByName(bookName);
        if (book == null) {
            book = new Book();
            book.name = bookName;
            book.author = "unknown";
            books.add(book);
        }
        return book;
    }

    private Kid findKidByName(String name) {
        for (Kid k : kids) {
            if (k.name != null && k.name.equals(name)) {
                return k;
            }
        }
        return null;
    }

    private Book findBookByName(String name) {
        for (Book b : books) {
            if (b.name != null && b.name.equals(name)) {
                return b;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        BookMain app = new BookMain();

        //Stores items in lists in bookmain unlike solution A
        //Stores strings instead of objects in book and kid
        app.handleNewReading("Moby Dick", "Alice");
        app.handleNewReading("Moby Dick", "Bob");
        app.handleNewReading("1984", "Alice");

        //Information comes from strings rather than from objects
        app.handlePrintReportForKid("Alice");
        app.handlePrintReportForBook("Moby Dick");
    }
}
