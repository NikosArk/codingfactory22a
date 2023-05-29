package gr.aueb.cf4;

/**
 * Eκτυπώνει σε αύξουσα σειρα 1, 2 ,..., 10
 */
public class Stars10Asc {
    public static void main(String[] args) {
        for ( int  i= 1; i <= 10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
