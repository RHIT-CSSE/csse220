package booksA;


import java.util.ArrayList;
import java.util.List;

public class Book {
    String name;
    String author;

    List<Kid> kids = new ArrayList<>();

    void printReport() {
        System.out.println("Book: " + name + " by " + author);
        System.out.println("Kids who read this book:");
        for (Kid k : kids) {
            System.out.println(" - " + k.name + " (grade " + k.gradeLevel + ")");
        }
    }

    void addKid(Kid kid) {
        if (kid == null) {
            return;
        }
        if (!kids.contains(kid)) {
            kids.add(kid);
        }
    }
}
