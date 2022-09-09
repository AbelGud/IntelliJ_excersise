import java.util.Scanner;

public class isolatedNumber {
    public static void main(String[] args){
        System.out.println("Please inter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int result = isIsolatedNumber(number);
        System.out.println("The result is: " + result);
    }
    public static int isIsolatedNumber(int n){
        long spr_num = n*n;
        long cube_num = n*n*n;
       // int sum = 0;
        while(cube_num > 0){
            long cubeDigit = cube_num % 10;
            cube_num /=10;
            long tempSq = spr_num;
            while (tempSq > 0){
                long sqreDigit = tempSq % 10;
                tempSq /= 10;

                if(sqreDigit == cubeDigit){
                    return 1;
                }
            }

        }
        return 0;

    }
}
