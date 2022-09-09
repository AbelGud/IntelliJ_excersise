

import java.util.Arrays;
import java.util.Scanner;

public class repsEqual {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter the length of the array: ");

        int len = input.nextInt();
        int [] array = new int [len];
        System.out.println("Enter the num value: ");
        int num = input1.nextInt();


        for(int i = 0, j = 1; i < len; i++,j++){
            System.out.println("The value of " + j + "value");
            array[i] = input.nextInt();

        }
        System.out.println("The given array is : " + Arrays.toString(array));

        int result = isrepsEqual(array,num);
        System.out.println(result);
    }
    public static int isrepsEqual(int []a, int n){
        int result = 0 ;
        int len = a.length-1;
        for(int i = len ; i > 0; i--){
            if(n%10 == a[i]){

                result = 1;
            }
            else {
                result = 0;
                break;
            }

            }
        return result;
        }

    }

