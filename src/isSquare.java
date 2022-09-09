import java.util.Scanner;

public class isSquare {

    public static void main(String[] args){
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result = isSquare1(num);
        System.out.println("The result is " + result);
    }
    public static int isSquare1(int n){
        for (int i = 0; i < n; i++) {
            if(i*i == n){
                return 1;
            }


        }
        return 0;
    }
}
