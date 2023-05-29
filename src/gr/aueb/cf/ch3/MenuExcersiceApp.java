package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Να εμφανίζει ένα μενού και το αντίστοιχο
 * μήνυμα ανάλογα με την επιλογή του χρήστη,
 */
public class MenuExcersiceApp {
    public static void main(String[] args) {

        //Δήλωση μεταβλητών
        Scanner in = new Scanner(System.in);
        int choice = 0;
        int i = 1;

        do {
            System.out.println("1.Εισαγωγή");
            System.out.println("2.Διαγραφή");
            System.out.println("3.Ενημέρωση");
            System.out.println("4.Αναζήτηση");
            System.out.println("5.Έξοδος");
            choice = in.nextInt();
                    if (choice == 1) {
                        System.out.println("Επιλέξατε Εισαγωγή");
                    } else if (choice == 2) {
                        System.out.println("Επιλέξατε Διαγραφή");
                    } else if (choice == 3) {
                        System.out.println("Επιλέξατε Ενημέρωση");
                    } else if (choice == 4) {
                        System.out.println("Επιλέξατε Αναζήτηση");
                    } else if ( choice <= 0 || ( choice > 5)) {
                        System.out.println("Λάθος επιλογή, ξαναπροσπαθήστε");
                    } else  {
                        System.out.println("Έξοδος από το πρόγραμμα, γεία σας");
                    }
        } while ( choice != 5);
        }
    }
