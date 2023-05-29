package gr.aueb.ch10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class MobileContactsApp {

    final static String[][] contacts = new String[500][3];
    static int pivot = -1;
    final static Path path = Paths.get("C:/Users/Nikos/Documents/Coding Factory/java/tmp/log-mobile.txt");

    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s;
        boolean quit = false;

        do{
            printMenu();
            s= getChoice();
            if (s.matches("[qQ]")) quit = true;
        }

        switch (choice){
            case 1:
                printContactMenu();
                insertController(getFirs)
        }





    }


    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εισαγωγη Επαφης");
        System.out.println("2. Διαγραφη Επαφης");
        System.out.println("3. Ενημερωση Επαφης");
        System.out.println("4. Αναζητηση Επαφης>");
        System.out.println("5. Εκτυπωση ολων των Επαφων");
        System.out.println("Q. Εξοδος");
    }

    public static String getChoice() {
        System.out.println("Εισαγετε επιλογη");
        return in.nextLine().trim();
    }

    public static void printContactMenu() {
        System.out.println("Eισαγετε Ονομα, Επωνυμο και τηλεφωνο");
    }

    public static String getFirstNameMenu() {
        System.out.println("Εισαγετε ονομα");
        return  in.nextLine();
    }

    public static String getPhoneNumber() {
        System.out.println("Εισαγετε αριθμο τηλεφωνου");
        return in.nextLine();
    }
    /*
     * Controllers
     */

    public static Void insertController(String firstname, String lastname, String phoneNumber) {
        try {

            //Validation
            if (firstname == null || lastname == null || phoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (firstname.length() < 2 || firstname.length() > 50) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (phoneNumber.length() < 2 || phoneNumber.length() > 50) {
                throw new IllegalArgumentException("phoneNumber is not valid");
            }

            // Service call
            insertContactService(firstname.trim(), lastname.trim(), phoneNumber.trim());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static Void updateController(String oldPhoneNumber, String firstname, String lastname,  String newPhoneNumber) {
        try{

            //Validation
            if (oldPhoneNumber == null || firstname == null || lastname == null || newPhoneNumber == null) {
                throw new IllegalArgumentException("Nulls are not allowed");
            }

            if (oldPhoneNumber.length() < 2 || oldPhoneNumber.length() > 50) {
                throw new IllegalArgumentException("Old phone number is not valid");
            }

            if (firstname.length() < 2 || firstname.length() > 50) {
                throw new IllegalArgumentException("Firstname is not valid");
            }

            if (lastname.length() < 2 || lastname.length() > 50) {
                throw new IllegalArgumentException("Lastname is not valid");
            }

            if (newPhoneNumber.length() < 2 || newPhoneNumber.length() > 50) {
                throw new IllegalArgumentException("phoneNumber is not valid");
            }

            // Service call
            updateContactService(oldPhoneNumber.trim(), firstname.trim(), lastname.trim(), newPhoneNumber.trim());
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] deleteController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12) {
                throw new IllegalArgumentException("phoneNumber is not valid");
            }
            return deleteContactService(phoneNumber);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] getOneController(String phoneNumber) {
        try {
            if (phoneNumber.length() < 2 || phoneNumber.length() > 12) {
                throw new IllegalArgumentException("phoneNumber is not valid");
            }
            return getOneController(phoneNumber);
    }catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String[] getAllContactsController() {
        try {
            return getAllContactsService();
        }catch ()
    }








    /*
     *Service Layer
     */

    public static String[] getOneContact(String phoneNumber) {

        try{
        String[] contact = getContactByPhoneNumber(phoneNumber);
        if(contact.length == 0) {
            throw new IllegalArgumentException("Contact not found");
        }
        return contact;
    }catch (IllegalArgumentException e)

    {
        log(e);
        throw e;
    }
    }

    public static String[][] getAllContactsService() {
        try {
            String[][] contactsList = getAllContacts();
            if (contactsList.length == 0) {
                throw new IllegalArgumentException("list is empty");
            }
            return contactsList;
        }catch (IllegalArgumentException e){
            log(e);
            throw e;
        }
    }

    public static void  insertContactService(String firstname, String lastname, String phoneNumber) {
        try{
            if (!(insert(firstname, lastname, phoneNumber))) {
                throw new IllegalArgumentException(("Error in insert"));
            }
        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static void updateContactService(String oldNumber, String firstname, String lastname, String newPhoneNumber){
        try{
            if (!(update(oldNumber, firstname, lastname,newPhoneNumber))) {
                throw new IllegalArgumentException("Error in update");
            }
        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }

    public static String [] deleteContactService(String phoneNumber) {
        String [] contact;

        try{
            contact = delete(phoneNumber);
            if (contact.length == 0) {
                throw new IllegalArgumentException("Error in Delete");
            }
            return contact;
        }catch (IllegalArgumentException e) {
            log(e);
            throw e;
        }
    }



        /*
         *   CRUD Services that are provided to Service Layer.
         */

    public static int getIndexByNumber(String phoneNumber)   {
        for (int i = 0; i <= pivot; i++) {
            if(contacts[i][2].equals(phoneNumber)) {
                return i;

            }
        }  return -1; //if not found
    }

    public static boolean insert(String firstname, String lastname, String phoneNumber) {
        boolean inserted = false;

        if (isFull(contacts)) {
            return false;
        }

        if (getIndexByNumber(phoneNumber) != -1) {   //αν ειναι διαφορ του 01 σημαινει οτι βρηκε τηλεφωνο στην παραπανω μεθοδο
            return false;
        }
        pivot++;
        contacts[pivot][0] = firstname;
        contacts[pivot][1] = lastname;
        contacts[pivot][2] = phoneNumber;

        return true;
    }

    public static boolean update(String oldPhoneNumber, String firstname, String lastname, String newPhoneNumber) {
        int positionToUpdate = getIndexByNumber(oldPhoneNumber);
        String[] contact = new String[3];

        if (positionToUpdate == -1) {
            return  false;
        }

        contacts[positionToUpdate][0] = firstname;
        contacts[positionToUpdate][1] = lastname;
        contacts[positionToUpdate][2] = newPhoneNumber;
        return true;
    }

    public static String[] delete(String phoneNumber) {
        int positionToDelete = getIndexByNumber(phoneNumber);
        String[] contact = new String[3];

        if (positionToDelete == -1) {
            return new String[] {};
        }

      System.arraycopy(contacts[positionToDelete], 0, contact, 0, contact.length);

        if (!(positionToDelete == contact.length -1) ) {
            System  .arraycopy(contacts, positionToDelete + 1, contacts, positionToDelete, pivot - positionToDelete);
        }
        pivot--;
        return contact;
    }

    public static String[] getContactByPhoneNumber(String phoneNumber) {
        int positionToReturn = getIndexByNumber(phoneNumber);

        if (positionToReturn == -1) {
            return  new String[] {};
        }
        return  contacts[positionToReturn];
    }

    public static String[][] getAllContacts() {
        return Arrays.copyOf(contacts, pivot + 1);
    }


    public static boolean isFull(String [][] arr) {
        return pivot == arr.length-1; // -1 γιατι ο pivot ξεκιναει απο τη θεση -1
    }

    /*
    * Custom Logger
    * Varargs String[] message
    * log(Exception)
     */

    public static void log(Exception e, String...message) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(path.toFile(), true))){
            ps.println(LocalDateTime.now() + "\n" + e.toString());
            ps.printf("%s", (message.length == 1) ? message[0] : "");

        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
