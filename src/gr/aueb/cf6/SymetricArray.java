package gr.aueb.cf6;

public class SymetricArray {

    public static void main(String[] args) {


    }

    public static boolean isArraySymmetric(int[] arr) {
        boolean isSymmetric = true;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) { //στην for μπορω να βαλω και δευτερο στοιχειο//
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArrSymmetric(int[] arr) {
        boolean isSymmetric = true;
        int n = arr.length -1;

        for(int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n-i]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }
}
