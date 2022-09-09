import java.util.Scanner;
import java.math.*;

public class isLegalNum {
    public static void main (String[] args){
        System.out.println("How many arrays do you want to Enter? ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int [] array = new int[length];

        for(int i=0, j=1; i < length;i++,j++){
            System.out.println("Please enter " + j +"th value: ");
            array[i] = input.nextInt();
        }
        System.out.println("Please enter the base Number: ");
        int base = input.nextInt();
        double result = isLegalNumber(array,base);
        int res = (int)result;

        System.out.println("The converted number is: " + res);

    }
    public static double isLegalNumber(int []a,double base){
        double sum = 0;
        double count = base;
        for(int i = 0,j = a.length-1; i < a.length; i++, j--){
            if(a[i] >= base && a.length == 0){
                sum = 0;
                break;
            }
            else {

             sum += a[i]*Math.pow(base,j);

                }

            }
        return sum;
        }
       // return sum;

    }


