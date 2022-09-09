import java.util.Scanner;

public class sumSafe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many arrays do you want to inter: ");
        int length = input.nextInt();
        int [] array = new int[length];
        for(int i = 0, j=1; i < length; i++,j++){
            System.out.println("Please enter the " + j + " value ");
            array[i] = input.nextInt();
        }
        int result = sum_safe(array);
        System.out.println("The result is : " + result);

    }
    public static int sum_safe(int []a){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        if(sum == 0){
            return sum;
        }
        else {
            return 1;
        }
    }
}
