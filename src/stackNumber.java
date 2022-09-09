import java.util.Scanner;

public class stackNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Number ");
        int number = input.nextInt();
        int result = isStackNumbers(number);
        System.out.println("The result is: " + result);


    }
    public static int isStackNumbers(int numbers){
        int sum = 0;
        for(int i = 1; i <= numbers;i++){
            sum += i;

            }


        return sum;
    }
}
