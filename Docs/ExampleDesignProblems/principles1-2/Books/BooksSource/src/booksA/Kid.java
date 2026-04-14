package booksA;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    String name;
    String gradeLevel;

    List<Book> books = new ArrayList<>();

    void printReport() {
        System.out.println("Kid: " + name + " (grade " + gradeLevel + ")");
        System.out.println("Books read:");
        for (Book b : books) {
            System.out.println(" - " + b.name + " by " + b.author);
        }
    }

    void addBook(Book book) {
        if (book == null) {
            return;
        }
        if (!books.contains(book)) {
            books.add(book);
        }
    }
}
