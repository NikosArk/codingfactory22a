package gr.aueb.cf2;

import java.math.BigInteger;

/**
 * Demonstrates BigInteger class
 */

public class AddBigIntApp {

    public static void main(String[] args) {
            BigInteger bigNum = new BigInteger("2147483647");
            BigInteger bigNum2 = new BigInteger("2147483647");
            BigInteger result = new BigInteger("0");
            BigInteger result2 = new BigInteger("0");

            result = bigNum.add(bigNum2);
            result2 = bigNum2.add(bigNum);

        System.out.printf("%d\n", result);
        System.out.printf("%d\n", result2);
        System.out.println(result2);

    }
}
