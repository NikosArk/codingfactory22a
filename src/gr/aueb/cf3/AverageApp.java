package gr.aueb.cf3;

import java.util.Scanner;

/**Βρίκσει το μέσο όρο της
 * βαθμολογίες ενός μαθητή. παρέχονται τα total και
 * count με μεγιστο το 10
 */
public class AverageApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0 || total < 0) {
            System.out.println("Invalid count");
            System.exit(1);
        }

//        if (total < 0) {
//        System.out.println("Invalid total");   Αυτα αν δεν το εκανα με || πιο πανω
//        System.exit(1);
//        }

        average = total / count;

        if (average > 10) {
            System.out.println("Invalid average");
            System.exit(1);
        }

        if ( average >= 9) {  // ξεκιναμε απο το 9 και κατεβαινουμε πιο κατω για τπαμε απο το πιο ειδικο στο πιο γενικο
            System.out.println("Excellent");    // επισης θα μας εβγαζε λαθος μηνυμα αν το ειχαμε αλλιως,
        } else if (average >= 7) {          
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }

        }


    }
