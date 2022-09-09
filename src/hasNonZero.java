import java.util.Scanner;

public class hasNonZero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many arrays do you want enter: ");
        int len = input.nextInt();
        int[] array = new int[len];
        for(int i = 0, j=1; i < len; i++,j++){
            System.out.println("Please enter " + j +" values ");
            array[i] = input.nextInt();
        }
        int result = itHaseNonZero(array);
        System.out.println(" The result is " + result);
    }
    public static int itHaseNonZero(int []a){
        int result = 0;
        for (int i= 0; i < a.length; i++){
            if(a[i] == 0){
                result = 0;
                break;
            }
            else {
                result = 1;
            }
        }
        return result;
    }
}
