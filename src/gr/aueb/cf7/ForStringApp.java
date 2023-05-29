package gr.aueb.cf7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        String substring = s.substring(0, 6);
        System.out.println(substring);
//
//                for ( int i = 0; i < s.length(); i++) {
//                    System.out.print(s.charAt(i) + " ");
//                }
////
//        System.out.println("\u2764");
//
//                for (char ch : s.toCharArray()) {  // s.toCharArray ειναι μετατροπη απο string se char
//                    System.out.print(ch + " ");
//                }
//        System.out.println("\u2764");
//
//
//        int index = s.indexOf("o", 7);// to 7 ειναι για να του π πω πια θεση να ξεκινησει να ψαχνει το ο. ξεκιναει απο το πρωτο ο
//        int index2 = s.lastIndexOf("o"); //σε αυτο ξεκιναει να ψανχνει απο το τελος προς τα πισω
//        System.out.println(index);
//        System.out.println(index2);
//
//        if(s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
