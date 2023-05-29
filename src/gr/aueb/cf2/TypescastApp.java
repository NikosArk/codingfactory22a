package gr.aueb.cf2;

public class TypescastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L; // Ουσιαστικα εκανα και το 20 long με το L διπλα του γιατι αν το αφηνα 20 θα ηταν int
        long result = 0L;

        num1 = (int) num2;

        result = num1 + num2; // ακεραιος με long. η java μετατρεπει παντα το μικροτερο στο μεγαλυτερο, δλδ int σε long
    }                          //αν ειναι απο int σε long το κανει μονο του γιατι ειναι απο το μικροτερο στο μεγαλυτερο
                            //οταν ομως ειναι απο το μεγαλυτερο στο μικροτερο πρεπει να το κανουμε typecast
}
