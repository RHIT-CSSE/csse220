package student;

public class StudentV2 {
    private String name;
    private static char grade;

    public StudentV2(String name, char grd) {
        this.name = name; 
        StudentV2.grade = grd;
    }

    @Override 
    public String toString() {
        return name + " earned " + grade;
    }

    public static void main(String[] args) {
        StudentV2 a = 
            new StudentV2("Adaline", 'A');
        StudentV2 b = 
            new StudentV2("Belicia", 'B');
        StudentV2 c = 
            new StudentV2("Charlie", 'C');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}