
public class StringDemo {

    public static void main(String[] args) {
        
        String name = "Rosie the Elephant"; 
        // index help: 012345678901234567
        char singleLetter = name.charAt(2);
        String partOfString = name.substring(6, 9);
        int numCharacters = name.length();

        System.out.println("The value of singleLetter is " + singleLetter);
        System.out.println("The value of partOfString is " + partOfString);
        System.out.println("The value of numCharacters is " + numCharacters);
        System.out.println(name.substring(8));

        // Aside: Now that we know what String means, 
        // what does "String[] args" mean in the main method header? 
    }

}
