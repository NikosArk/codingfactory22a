package gr.aueb.cf7;

/**
 * Splits a string
 */
public class StringSplitApp {

    public static void main(String[] args) {

        String s = "Athens Uni of Eco and Business";

        String[] tokens = s.split("  +");

        for(String token: tokens) {
            System.out.println(token);
        }
    }
}
