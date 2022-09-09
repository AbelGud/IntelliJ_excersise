import java.util.Scanner;

public class stanton {
    public static void main(String[] args){
        System.out.println("Please enter the length of arrays: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int [] array = new int[len];

        for(int i = 0, j = 1; i < array.length;i++,j++){
            System.out.println("Enter the " + j + " th value ");
            array[i] = input.nextInt();
        }

        int result = stantonMesure(array);
        System.out.println("The stanton Mesure value is: " + result);
    }
    public static int stantonMesure(int []a){
        int count = 0;
        int stantonMesur = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1){
                count++;
            }
        }
        for (int j = 0; j < a.length; j++){
            if(count == a[j]){
                stantonMesur++;
            }
        }
        return  stantonMesur;
    }
}
