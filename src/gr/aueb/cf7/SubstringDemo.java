package gr.aueb.cf7;

public class SubstringDemo {
    public static void main(String[] args) {
        String s = "Athens Uni of Economics and Bus";

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.substring(i, i + 1)); //ειναι και αυτος ενα τροπος για να εκτυπωνω μεγαλα κομματια στρινγκ
        }                               // επισης ειναι ι + 1 για να συμπεριλαβω και το τελευταιο χαρακτηρα λλιως δεν θα το επαιρνε λογω την παρενθεσης

        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) { //to grafei anapoda
            System.out.print(s.charAt(i));
        }

    }

}
