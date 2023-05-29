package gr.aueb.cf4;

/**
 * Εκτυπωνει 10, 9, 8,..., 1
 * αστεραι(α) ε καθε γραμμη
 * ξεκινωντας απο τη 1η γραμμη
 */
public class Stars10Desc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            for (int j = i; j <= 10; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}

