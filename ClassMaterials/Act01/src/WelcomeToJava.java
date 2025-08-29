/**
 * A first Java program demonstrating primitive variables, 
 * operators, and print statements. 
 * 
 * This is an example of a JavaDoc comment. Notice its format. 
 * We will use these to document our code 
 * so we can quickly remember (or other people can learn) 
 * what each part is supposed to do/represent. 
 * 
 * Hover over the name of the class, "WelcomeToJava", 
 * to see a prettier version. 
 * 
 * @author Ian Ludden
 */
public class WelcomeToJava {
    /**
     * The main method is where Java programs start. 
     * We will learn what the "public static void" part 
     * means later in the course, and 
     * the same goes for the "String[] args" parameter. 
     * 
     * (Aside: hover over the name of the method, "main", 
     * to see a prettier version.)
     * 
     * @param args - command-line arguments, not used here
     */
    public static void main(String[] args) {
        // This is an in-line Java comment. We use these to add short explanations. 

        // === Model 1 ===
        // Predict what will happen, then run the program and see. 
        int x = 3;
        int xSquared = x * x;
        System.out.println(x);
        System.out.println(xSquared);

        // === Model 2 ===
        /*
         * Predict the output when you run these two lines, 
         * then uncomment them and run to confirm.
         * 
         * Hint: you can uncomment many lines at the same time 
         * by selecting them all and pressing "Control + /"
         * 
         * (Aside: This is a multi-line comment. 
         * You can use these for longer explanations.)
         */
        // int y = 15 - 4 / 2 * 3 + 1;
        // System.out.println(y);
        
        // Again, predict the output, then uncomment and run. 
        // int dividend = 7;
        // int divisor = 2;
        // System.out.println(dividend / divisor);
        // System.out.println(dividend % divisor); 

        // Once again, predict the output, then uncomment and run. 
        // System.out.println(11. / 4);
        // System.out.println(13 / 4.);
        // System.out.println(15 / 4);
        // System.out.println(14.0 / 4);
        // System.out.println(9 / 4);

        // Once again, predict the output, then uncomment and run.
        // int dollars; 
        // int cents; 
        // dollars = 2;
        // System.out.println(dollars);
        // System.out.println(cents); // What goes wrong here? 
        // dollars = 3;
        // dollars = 4;
        // cents = 49;
        // System.out.println(dollars);
        // System.out.println(cents);
        
    }

}
