import java.util.Scanner;

public class sumFact {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len = input.nextInt();
        int [] array = new int[len];


        for(int i = 0,j=1; i < array.length; i++,j++){
            System.out.println("Enter the " + j + " th value");
            array[i] = input.nextInt();
        }
        int result = sumFactor(array);
        System.out.println("The result is: " + result);
    }
    public static int sumFactor(int [] a){
        int sum = 0;
        int count = 0;
        for(int i = 0 ; i < a.length; i++){
            sum += a[i];
        }
        for(int j = 0 ; j < a.length; j++ ){
            if(sum == a[j]){
                count++;
            }
        }
        return count;
    }
}
