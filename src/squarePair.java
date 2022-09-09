import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class squarePair {
    public static void main(String[] args) {
        System.out.println("Please enter the length of Array: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int[] arrays = new int[len];
        for (int i = 0, j = 1; i < len; i++, j++) {
            System.out.println("Please enter the " + j + "th value element");
            arrays[i] = input.nextInt();
        }
        System.out.println("The give arrrays are: " + Arrays.toString(arrays));
        System.out.println();


        int result = iscountSqr(arrays);
        System.out.println("The count pair result: " + result);


    }


    public static int iscountSqr(int[] a) {
        boolean isduplicated = false;
        int countSqrt = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if ((a[i] == a[j]) && (i != j)) {
                    isduplicated = true;
                    break;
                } else if (i == j) {
                    continue;

                } else {
                    if (a[i] != 0 && a[j] != 0) {
                        if (a[i] < a[j]) {
                            if (isPerfectSqrt(a[i] + a[j]) == 1) {
                                countSqrt++;
                                System.out.println("< " + a[i]+" "+ a[j] + " > ");
                            }
                        }
                    }
                }
            }
            if (isduplicated) {
                break;
            }
        }
        return countSqrt;
    }

    public static int isPerfectSqrt(int element){
        int isPerfectSqrt = 0;
        if( element >= 0){
            double sqrt = Math.sqrt(element);
            int base = (int) sqrt;
            if((base - sqrt) == 0){
                isPerfectSqrt = 1;

            }
            else {
                isPerfectSqrt = 0;
            }
        }
        return isPerfectSqrt;

    }
}


