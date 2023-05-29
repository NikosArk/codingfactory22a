package gr.aueb;

import java.util.Scanner;

/**
 * Μετατρέπει euros σε δολάρια ΗΠΑ.
 * Λαμβάνει από τον χρήστη (stdn) ένα ακέραιο
 * που συμβολίζει το ποσό σε Euros και μετατρέπει
 * σε δολάρια και εμφανίζει το τελικό αποτέλεσμα.
 */

public class EuroToUsdConvertedApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Δήλωση και αρχικοποίηση
        int inputEuros = 0;          // το εγραψα intputEuros μονο και μονο για να δειξω οτι ειναι τιμη που θα δωσω απο το
        int totalUsaCents = 0;      // πληκτρολογιο
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99; // Το κανω εως οτου οταν μια σταθερα αλλαξει μην παω στο προγραμμα και αλλαζω παντου τις
                                // τιμες αλλα μονο στην αρχικοποιηση της σταθερας

        //Εντολές

        System.out.println("Please insert an amount ( in Euros)");
        inputEuros = scanner.nextInt();     //nextInt() σημαινει οτι θα διαβασει τον επομενο int π εχει η θα του δωσω

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτύπωση αποτολεσμάτων

        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);



    }
}
