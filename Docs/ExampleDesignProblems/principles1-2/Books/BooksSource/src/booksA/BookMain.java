package booksA;

import java.util.ArrayList;
import java.util.List;

public class BookMain {

    //No Global list of books
    List<Kid> kids = new ArrayList<>();

    void handleNewReading(String bookName, String kidName) {
        Kid kid = findOrCreateKid(kidName);
        Book book = findOrCreateBookForKid(kid, bookName);

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
        Book found = null;

        // No global list of books; search through every kid's books
        // Can result in data duplication unless properly managed
        for (Kid k : kids) {
            for (Book b : k.books) {
                if (b.name != null && b.name.equals(bookName)) {
                    found = b;
                    break;
                }
            }
            if (found != null) {
                break;
            }
        }

        if (found != null) {
            found.printReport();
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

    private Kid findKidByName(String name) {
        for (Kid k : kids) {
            if (k.name != null && k.name.equals(name)) {
                return k;
            }
        }
        return null;
    }

    private Book findOrCreateBookForKid(Kid kid, String bookName) {
        for (Book b : kid.books) {
            if (b.name != null && b.name.equals(bookName)) {
                return b;
            }
        }
        Book book = new Book();
        book.name = bookName;
        book.author = "unknown"; 
        kid.books.add(book);
        return book;
    }


    public static void main(String[] args) {

        BookMain app = new BookMain();

        //Stores books only in kids
        app.handleNewReading("Moby Dick", "Alice");
        app.handleNewReading("Moby Dick", "Bob");
        app.handleNewReading("1984", "Alice");

        app.handlePrintReportForKid("Alice");

        //Has to search all the kids to find the book
        app.handlePrintReportForBook("Moby Dick");
    }
}

