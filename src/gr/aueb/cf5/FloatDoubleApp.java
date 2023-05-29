package gr.aueb.cf5;

public class FloatDoubleApp {
    public static void main(String[] args) {
        float f = 3.5F; // κανω typecast γιατι μονο του δεν μπορει, αφου το 3.5 απο μονο του ειναι double π ειναι μεγαλυτερο και δεν γινεται μονοτ αφου το float einai mikrotero
        double d = 10.5;
        float myFloat = 10F;
        double myDouble = 20D;

        System.out.println(f);
        System.out.printf("f = %f, d = %f", f, d);
    }
}
