package gr.aueb.cf4;

/**
 * Eκτυπώνει 10 γραμμες με 10 αστερακια σε καθε γραμμη
 */
public class Stars10App {
    public static void main(String[] args) {

        for ( int i = 1; i <= 10; i++) {

            for (int j = 1; j <=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
