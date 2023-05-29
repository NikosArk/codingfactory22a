package gr.aueb.cf4;

import java.io.IOException;

/**Διαβάζει έναν char  με την Systeme.in.read()
 *
 */
public class CharInputeApp {
    public static void main(String[] args) throws IOException {

        char inputChar;

        System.out.println("Please insert an ASCII char");
        inputChar = (char) System.in.read(); // θα μ βγαλει λαθος για αυτο παω πιο πανω και βαζω το throws IOException
                                                // επισης επειδη ειναι χαμηλου επειπεδου  η nputchar ρεπει να κανω typecast
        System.out.println("char: " + inputChar);
    }
}
