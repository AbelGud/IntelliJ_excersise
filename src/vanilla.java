import java.util.Scanner;

public class vanilla {
    public static void main(String[] args) {
        System.out.println("Number of arrayes:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[] array = new int[length];
        for (int i = 0, j = 1; i < length; i++, j++) {
            System.out.println("Please enter the " + j + "th value: ");
            array[i] = input.nextInt();
        }
        int result = isVanilla(array);
        System.out.println("The result is: " + result);


    }

    public static int isVanilla(int[] a) {
        int remainDigit = a[0] % 10;
        int result = 1;


        for (int i = 1; i < a.length; i++) {
            if (remainDigit != a[i] % 10) {
                result = 0;
            } else {
                int digit = a[i]/10;
                while( digit > 0){
                    int sec_dig = digit % 10;
                    if(remainDigit != sec_dig){
                        result = 0;
                        break;
                    }
                    digit/=10;
                }
            }
        }

        return result;
    }
}