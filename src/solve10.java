import java.util.Scanner;

public class solve10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = input.nextInt();
        System.out.println("enter the secound number: ");
        int num2 = input.nextInt();

        int result = solved10(num1,num2);
        System.out.println("The result is : " + result);

    }
    public static int solved10(int n, int m){
        int nsolve = 1;
        int msolve = 1;
        int multiple1 = 0;
        int multiple2 = 0;
        for(int i = 1; i < n; i++){
            nsolve *= n*(n-i) / n;
        }
        for(int j = 1; j < m ; j++){
            msolve *= m*(m-1) / m;
        }
        multiple1 = n * nsolve;
        multiple2 = m * msolve;

        int total = multiple1 + multiple2;

        return total;
    }

}
