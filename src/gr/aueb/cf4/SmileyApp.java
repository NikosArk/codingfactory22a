package gr.aueb.cf4;

/**
 * Print a smiley
 */
public class SmileyApp {
    public static void main(String[] args) {
         int codePoint = 0x1F600; //αυτο ειναι πανω απο 16bit αρα το μετατρεπω εσ δυο π ειναι πιο κατω. νομιζω

        System.out.println("Smiley: \ud83d\ude00"); //
    }
}
