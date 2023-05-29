package gr.aueb.cf2;

import java.util.Scanner;

/**
 * Διαβάχει απο το std input (πληκτρολογιο)
 * δυο ακεραιους και τους  προσθετει
 */

public class ScannerApp {
    public static void main(String[] args) {
        //Δηλωση μεταβλητων και αρχικοποιηση
        Scanner in = new Scanner(System.in); //to scanner in sindei to pliktrologio se pragmatiko xrono me to Scanner in
        int num1= 0;
        int num2 = 0;
        int sum = 0;

        //Εντολες

        System.out.println("Please insert two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        // Εκτυπωση αποτελεσματων
        System.out.printf("%d + %d = %d", num1, num2, sum);

    }
}
