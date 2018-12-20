package com.zubkov;
import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            String answer = in.nextLine();
            if (answer.equals("exit")) {
                in.close();
                System.exit(0);
            } else
                try {
                    System.out.println(isSimple(new BigInteger(answer), 2));
                }
                catch (NumberFormatException nfe){
                    System.out.println("Введено не число");
                }
        }
    }

    private static String isSimple(BigInteger n, int k) {
        // k- доп. параметр.
        if (n.equals(2))
            return n + " - простое";
        else if (n.compareTo(BigInteger.TWO) < 0 || n.mod(BigInteger.valueOf(k)).equals(BigInteger.ZERO))
            return n + " - составное";
        else if (BigInteger.valueOf(k).compareTo(n.divide(BigInteger.TWO)) < 0)
            return isSimple(n, k + 1);
        else
            return n + " - простое";
    }
}
