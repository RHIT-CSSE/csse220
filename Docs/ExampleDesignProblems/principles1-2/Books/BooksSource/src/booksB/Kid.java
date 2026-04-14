package booksB;

import java.util.ArrayList;
import java.util.List;

public class Kid {
    String name;
    String gradeLevel;

    //lists of book names/authors instead of Book references
    List<String> bookNamesRead = new ArrayList<>();
    List<String> bookAuthorsRead = new ArrayList<>();

    void printReport() {
        //Stored strings to find which books have been read
        System.out.println("Kid: " + name + " (grade " + gradeLevel + ")");
        System.out.println("Books read:");
        for (int i = 0; i < bookNamesRead.size(); i++) {
            String bookName = bookNamesRead.get(i);
            String author = (i < bookAuthorsRead.size())
                    ? bookAuthorsRead.get(i)
                    : "unknown";
            System.out.println(" - " + bookName + " by " + author);
        }
    }

    void addBook(Book book) {
        if (book == null) {
            return;
        }
        //only store strings, not Book objects
        bookNamesRead.add(book.name);
        bookAuthorsRead.add(book.author);
    }
}
