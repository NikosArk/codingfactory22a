package gr.aueb.cf3;

/**
 * Υπολογίζει το άθροισμα και το
 * γινόμενο των 10 πρώτων ακεραίων.
 */

public class SumAndMul10App {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int mul = 1;

        while (i <= 10) {
            sum = sum + i;  // η αλλιως η ιδια πραξη sum += i;
            mul = mul * i; // η αλλιως mul *= i
            i++;
        }

        System.out.printf("Sum: " + sum);
    }

}
