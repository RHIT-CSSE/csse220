package booksB;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String name;
    String author;

    //lists of kid names and grade levels instead of Kid references
    List<String> kidsRead = new ArrayList<>();
    List<String> kidsGradeLevels = new ArrayList<>();

    void printReport() {
        //Uses the stored strings to find which kids have read the book
        System.out.println("Book: " + name + " by " + author);
        System.out.println("Kids who read this book:");
        for (int i = 0; i < kidsRead.size(); i++) {
            String kidName = kidsRead.get(i);
            String grade = (i < kidsGradeLevels.size())
                    ? kidsGradeLevels.get(i)
                    : "unknown";
            System.out.println(" - " + kidName + " (grade " + grade + ")");
        }
    }

    void addKid(Kid kid) {
        if (kid == null) {
            return;
        }
        // only store strings, not Kid objects
        kidsRead.add(kid.name);
        kidsGradeLevels.add(kid.gradeLevel);
    }
}
