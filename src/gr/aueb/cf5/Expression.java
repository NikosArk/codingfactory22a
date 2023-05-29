package gr.aueb.cf5;

/**
 * Float / Double Expressions
 */

public class Expression {
    public static void main(String[] args) {
        double num1 = 1265655.5;
        double num2 = 2.0;
        double result = 0.0;
        double mod = 0.0;

        result = num1 / num2; // 6,25
        mod = num1 % num2;  // 0.5

        System.out.printf("%,.2f / %.2f = %,.2f\n", num1, num2, result); // to .2 ειναι για να μ βγαζει μεχρι δυο δεκαδικα ή οσα επιλεξω
                                // το κομμα ειναι εποειδη ειναι μεγαλο νουμερο να βαζει κομματα για να ειναι πιο ευαναγνωστο το νουμεεερο
        System.out.printf("%.2f %% %.2f = %.2f", num1, num2, mod);
    }
}
