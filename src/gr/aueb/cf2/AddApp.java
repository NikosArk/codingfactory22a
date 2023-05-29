package gr.aueb.cf2;

/**
 * Overflow
 */

public class AddApp {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1= 2_147_483_647; // η java μας απιτρεπει της παυλες για λογους readability
        int num2 = 2;
        int result = 0;

        //Εντολές
        result = num1 + num2;

        /**
         * δεν θα μου βγαλει λαθος στο αποτελεσμα αλλα δεν θα μ βγαλει καθολου αποτελεσμα,
         * αυτο γινεται γιατι ειναι πολυ μεγαλο 0 ακεραιοs για int,
         * για    στο επομενο class (Αddbigintapp)
         */
    }
}
