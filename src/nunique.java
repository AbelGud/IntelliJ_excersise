import java.util.Scanner;

public class nunique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = input.nextInt();
        int[] array = new int[len];


        for (int i = 0, j = 1; i < array.length; i++, j++) {
            System.out.println("Enter the " + j + " th value");
            array[i] = input.nextInt();
        }
        System.out.println("Enter the unique Number: ");
        Scanner input1 = new Scanner(System.in);
        int number = input1.nextInt();


        int result = uniqueNumber(array, number);
        System.out.println("The result is: " + result);
    }

    public static int uniqueNumber(int[] a, int num) {
       // int sum = 0;
       // int f_index = 0;
       // int s_index = 0;
        int count = 0;
        int res = 0;
        for (int i = 0,j = 1; i < a.length; i++,j++) {
            if (a[i] + a[j] == num) {
               // f_index = a[i];
               // s_index = a[j];
               // sum = f_index + s_index;
                count++;

            }
        }
        if(count == 1){
            res = 1;
        }
        else {
            res = 0;
    }

        return res;
}
}


