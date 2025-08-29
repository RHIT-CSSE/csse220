package student;

public class StudentV1 {
    private String name;
    private char grade;

    public StudentV1(String name, char grd) {
        this.name = name; 
        this.grade = grd;
    }

    @Override 
    public String toString() {
        return name + " earned " + grade;
    }

    public static void main(String[] args) {
        StudentV1 a = 
            new StudentV1("Adaline", 'A');
        StudentV1 b = 
            new StudentV1("Belicia", 'B');
        StudentV1 c = 
            new StudentV1("Charlie", 'C');
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}