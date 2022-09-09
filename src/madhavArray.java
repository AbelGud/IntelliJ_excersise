/*
A Madhav array has the following property.
 a[0] = a[1] + a[2] = a[3] + a[4] + a[5] = a[6] + a[7] + a[8] + a[9] = ...
The length of a Madhav array must be n*(n+1)/2 for some n.
Write a method named isMadhavArray that returns 1 if its array argument is a Madhav array,
otherwise it returns 0. If you are programming in Java or C# the function signature is
 int isMadhavArray(int[ ] a)

 */

import java.util.Arrays;
import java.util.Scanner;

public class madhavArray {
    public static void main(String[] args){
        System.out.println("Please enter the length of array: ");
        Scanner input = new Scanner(System.in);
        int lengthArray = input.nextInt();
        int [] array = new int[lengthArray];
        for (int i = 0,j=1; i < lengthArray; i++,j++) {
            System.out.println("Please enter the " + j + "th arrays");
            array[i] = input.nextInt();

        }
        int result = isMadhavArray(array);
        if(result == 1){
            System.out.println("The array is Madhav");
        }
        else {
            System.out.println("This array is not madhav");
        }
    }
    public static int isMadhavArray(int[]a){
        int isMadhavArray = 0;
        int startIndex = 0;
        int endIndex = 0;
        int n=1;
        int currentSum = 0;
        int sum =0;
        int currentLengthOfArray = 1;
        int calculatedLengthOfArray =1;

        while(currentLengthOfArray <= a.length){
            if(currentLengthOfArray == calculatedLengthOfArray){
                for(int index = startIndex; index <= endIndex; index++){
                    currentSum += a[index];
                }
            }
            else {
                isMadhavArray = 0;
                break;
            }
            if((currentSum == sum) || (startIndex == endIndex)){
                sum = currentSum;
                currentSum = 0;
                isMadhavArray = 1;
            }
            else {
                isMadhavArray = 0;
                break;
            }
            if(currentLengthOfArray == a.length){
                break;
            }
            else {
                startIndex = endIndex +1;
                endIndex = startIndex + n;
                if((startIndex < a.length) && (endIndex < a.length)){
                    n++;
                }
                else {
                    endIndex = a.length-1;
                    n = endIndex-startIndex;
                }
                calculatedLengthOfArray = n*(n+1)/2;
                currentLengthOfArray = endIndex+1;

            }
        }
        return isMadhavArray;
    }
}
