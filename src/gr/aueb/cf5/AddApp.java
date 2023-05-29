package gr.aueb.cf5;

/**
 * προσθετει δυο ακεραιους με τξμ χρηση τη μεθοδου add
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = 0;

        sum = add(a,b);  // καλώ την add που εχω γραψει νωρίτερα πιο κάτω. επίσης  δεν έχει σημασία το όνομα των μεταβλητών.
                        //αλλα τα γραφω με τις ίδιες μεταβλητές για λόγους readability
        // το κανονικο ονομα της μεθοδου αdd(a,b) ειναι AddApp.add(a.b) που ειναι το ονομα της κλασης συν το ονομα της μεθοδου.
        //αλλα επειδη ειναι ηδη μεσα στην κλαση δεν χρειαζεται.

        System.out.println(sum);


    }

    public static int add(int a, int b) {   // αυτη ειναι η επικεφαλιδα ( απο το int και μετα)
//        int sum = 0;
//        sum = a + b;
//        return sum;
        return a + b; // με την return λεινει η μεθοδος αλλα δεν ειναι αναγκαια
    }

}
