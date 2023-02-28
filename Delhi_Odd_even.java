import java.util.Scanner;
import java.util.*;

public class Delhi_Odd_even {

    public static void Even_Odd(int n) {
        int oddsum = 0;
        int evensum = 0;

        while (n != 0) {
            int digit = n % 10;

            if (digit % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }

            n = n / 10;

        }

        if (evensum % 4 == 0 || oddsum % 3 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Even_Odd(n);
    }

}
