package nikos.practice;

import java.math.BigInteger;

public class AddBigIntPractice {
    public static void main(String[] args) {

        BigInteger bigNum1 = new BigInteger("400000000");
        BigInteger bigNum2 = new BigInteger("50000000");
        BigInteger bigResult = new BigInteger("0");

        bigResult = bigNum1.add(bigNum2).multiply(bigNum1);

        System.out.println("The result is " + bigResult);

    }
}
