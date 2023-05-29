package gr.aueb.cf4;

import java.util.Scanner;

/**
 * O Χρήστης έχει 10 ευκαιρίες για να
 * βρει ένα μυστικό κλειδί (int). Aν το
 * βρε νωρίτερα από τη 10η φορα, η for θα πρέπει
 * να σταματήσει
 */
public class FindTheSecretApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) { //αρα ελεγχουμε μονο αν το βρισκει και παρακατω
                found = true;
                break;
            }
        }
        if (! found) {  // δηλαδη εδω λεμε αν δεν το βρηκες δλδ found false  τοτε ..εντολες
            System.out.println("No worries, play again");
            System.exit(1);
        }
        System.out.println("Success! Play again!");
    }
}
