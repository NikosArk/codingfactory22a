package gr.aueb.cf.ch1;


import java.util.Scanner;

/**
 *Εμφανίζει ένα μενού και ο χρήστης πρέπει να επιλέξει
 * μία απο τις παρακάτω επιλογές. Η αντίστοιχη επιλογή να
 * τρέχει με την βοήθεια μεθόδου/μεθόδων.
 */
public class ExcerciseStarsMenu {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = 0;

        do{ printMenu();
            choice = onChoiceResult(choice);

            if (isChoiceInvalid(choice)) {
                System.out.println("Invalid choice, try again");
                continue;
            } else if (isChoiceQuit(choice)) {
                System.out.println("You chose exit");
                break;
            }

        } while (choice != 6);

    }
    public static void printMenu() {
        System.out.println("1.Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2.Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3.Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4.Εμφάνισε n γραμμές με αστεράκια 1-n");
        System.out.println("5.Εμφάνισε n γραμμές με αστεράκια n-1");
        System.out.println("6.Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή");
    }

    public static int getNextInt(){
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
       return choice < 1 || choice > 7 ;
    }

    public static boolean isChoiceQuit(int choice) { return choice == 6;}

    public static void horizontalStars() {
        int numStars;
        System.out.println("Please give the number of stars");
        numStars = getNextInt();
        do {
            if (numStars < 0) {
                System.out.println("Invalid Stars Number");
                continue;
            } else if (numStars == 0) {
                System.out.println("Zero Stars");
               break;
            } else {
                for (int i = 1; i <= numStars; i++) {
                    System.out.print('*');
                }
            }
        } while (numStars < 0);
    }

    public static void verticalStars(){
        int numStars = 0;
        do {
            System.out.println("Please give the number of stars");
            numStars = getNextInt();
            if (numStars < 0) {
                System.out.println("Invalid Stars Number");
                continue;
            } else if (numStars == 0) {
                System.out.println("Zero Stars");
                break;
            } else {
                for (int i = 1; i <= numStars; i++) {
                    System.out.println('*');
                }
            }
        } while (numStars <= 0) ;
    }


    public static void starsNxN(){
        int numStars = 0;
        do {
            System.out.println("Please give the number of stars");
            numStars = getNextInt();
            if (numStars < 0) {
                System.out.println("Invalid Stars Number");
                continue;
            } else if (numStars == 0) {
                System.out.println("Zero Stars");
               break;
            } else {
                for (int i = 1; i <= numStars; i++) {
                    for (int j = 1; j <= numStars; j++) {
                        System.out.print('*');
                    }
                    System.out.println("");
                }
            }
        } while (numStars <= 0) ;
    }

    public static void stars1ToN(){
        int numStars = 0;
        do {
            System.out.println("Please give the number of stars");
            numStars = getNextInt();
            if (numStars < 0) {
                System.out.println("Invalid Stars Number");
                continue;
            } else if (numStars == 0) {
                System.out.println("Zero Stars");
                break;
            } else {
                for ( int i = 1; i <= numStars; i++) {
                    for (int j = 1; j <=i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } while (numStars <= 0) ;
    }

    public static void starsNto1(){
        int numStars = 0;
        do {
            System.out.println("Please give the number of stars");
            numStars = getNextInt();
            if (numStars < 0) {
                System.out.println("Invalid Stars Number");
                continue;
            } else if (numStars == 0) {
                System.out.println("Zero Stars");
              break;
            } else {
                for (int i = 1; i <= numStars; i++) {

                    for (int j = i; j <= numStars; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }while(numStars <=0);
    }

    public static int onChoiceResult(int choice) {
        choice = getNextInt();

        switch (choice){
            case 1: horizontalStars();
            break;
            case 2: verticalStars();
            break;
            case 3: starsNxN();
            break;
            case 4: stars1ToN();
            break;
            case 5: starsNto1();
            break;
            default:break;
        } return choice;
    }
}

