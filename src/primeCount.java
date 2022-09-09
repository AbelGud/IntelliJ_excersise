/*
Write a function named primeCount with signature
 int primeCount(int start, int end);
The function returns the number of primes between start and end inclusive. Recall that a prime is
a positive integer greater than 1 whose only integer factors are 1 and itself
 */

import java.util.Scanner;

public class primeCount {
    public static void main(String[] args) {
        System.out.println("Please Enter the Start digit: ");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println("Please Enter the End Number:");
        int end = input.nextInt();
        int pcount = 0;
        int count = 0;


        for (int i = start; i <= end; i++) {
            if (start > end || start == 1) {
                System.out.println("Out of range or use unacceptable number!");
                break;
            }
            if (i > 1) {

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        pcount++;
                    }

                }

                if (pcount <= 2) {
                    count++;
                }
                pcount = 0;


                // System.out.println("Number of prime Numberes " + count);
        }

        }
        System.out.println("Number of prime Numberes " + count);
    }
    }


