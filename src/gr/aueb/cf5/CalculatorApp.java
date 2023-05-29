package gr.aueb.cf5;

import java.util.Scanner;

/**
 * Υλοποιει εναν απλο calculator παι παρεχει τις υπηρεσιες
 * add, sub, mul, dic, mod.
 * Εμφανίζει ένα Μενού προς τον χρήστη με επιλογές, λαμβάνει την τιμή της επιλογής
 * και στην συνέχεια δύο ακόμα τιμές των num1, num2.
 * και τελικα εμφανίζει το αποτέλεσμα
 *
 */
public class CalculatorApp {

    static Scanner in = new Scanner(System.in); //ΠΡΟΣΟΧΗ! ειναι static γιατι την εχω βαλει να ειναι global. δηλαδη ισχυει για
    // ολες τις παρακατω μεθοδους static και main. δλδ μπορω απευθειασ να βαλω in.nextINT() se ολες απευθειας βεβαια αυτη μπορει να αλλαξει πιο κατω και να παρει αλλη τιμη.

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;


        do {
            //print Menu
            printMenu();
            //choice = getNextInt("please insert your choice")
            choice = getNextInt("Please isnser your choice");
            //validation
            //if (isChoiceInvalid(choice) {; continue}
            //if (isChoiceQuit(choice) {break;}
            if (isChoiceInvalid(choice)) {
                System.out.println("choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }
            //result = onChoiceGetResult(choice);
            result = onChoiceGetResult(choice);
            //Sout(result)
            System.out.println("Result = " + result);
        } while (true);
    }

    public static void printMenu() { // δεν της βαζω ονομα γιατι  δεν εδινει κατι οπως δηλωνει και το void το ονομα της
        System.out.println("πιλέξτε ένα από τα παρακάτω");
        System.out.println("1.Πρόσθεση");
        System.out.println("2.Αφαίρεση");
        System.out.println("3.Πολλαπλασισμλος");
        System.out.println("4.Διαίρεση");
        System.out.println("5.Υπόλοιπο");
        System.out.println("6.Έξοδος");
    }

    public static int getNextInt(String message) { // δινουμε μια παραμετρο π παιρνει η in.nextInt()
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }


    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int mul(int num1, int num2) {
        return num1 * num2;
    }

    public static int div(int num1, int num2) {
        int value = 0; //αυτο το εκανα για να μην ειναι οπως στο mod π ειναι πιο κατω, αλλα και τα δυο σωστα, που εχει δυο return.
        //ενολιγης θελουμε να εχει ενα return
        if (num2 == 0) {
            value = Integer.MAX_VALUE; //epistrefei to apeiro gt einai paranomastis 0. san na toy grafw oti exei dwsei lathos paranomsth
        } else {
            value = num1 / num2;
        }
        return value;
        }

    public static int mod(int num1, int num2) {
        if (num2 == 0) {
            return Integer.MAX_VALUE;
        }
        return num1 % num2;
    }

    public static int onChoiceGetResult(int choice) {
        int num1 = getNextInt("Please insert the first number (int)");
        int num2 = getNextInt("Please insert the second number (int)");
        int result = 0;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            case 6:
            default:
                break;
        }
        return result;
    }


}
