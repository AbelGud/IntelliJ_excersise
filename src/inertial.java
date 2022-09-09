import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class inertial {
    public static void main(String[] args) {
        System.out.println("Enter the size of the Array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [ ] value = new int[size];
        for(int i = 0, j=1; i < size; i++,j++){

            System.out.println("Please enter the" + j + " th Value");
            value[i] = input.nextInt();
        }
        if(size <= 1){
            System.out.println("The arrays is not inertial. ");
        }
        else {
            int test1 = inertial.isInertial(value);
            if(test1 == 1){
                System.out.println("The Array is inertial.");
            }
            else {
                System.out.println("The Array is not inertial.");
            }
        }
        input.close();


    }
    public static int isInertial(int [] value){
        int testEvenMax = 0;
        int testOddGreat = 0;
        int testOddValue = inertial.isOddValue(value);
        if(testOddValue == 1){
            testEvenMax = inertial.isEvenMax(value);
        }
        else {
            return 0;
        }
        if(testOddValue == 1 && testEvenMax == 1){
            testOddGreat = inertial.isOddGreater(value);
        }
        else {
            return 0;
        }
        if(testOddValue == 0 || testEvenMax == 0 || testOddGreat == 0){
            return 0;
        }
        else {
            return 1;
        }


    }
    public static int isOddValue(int [] value){
        int len = value.length;
        int flag = 0;
        for(int i = 0; i < len; i++){
            if(value[i]%2 != 0){
                flag++;
                break;
            }
        }
        if(flag != 0){
            return 1;
        }
        else {
            return 0;
        }

    }
    public static int isEvenMax(int [] value){
        int len = value.length;
        int max = value[1];
        for (int i = 0; i < len; i++){
            if(value[i] < max){
                max = value[i];

            }
        }
        if(max %2 == 0){
            return 1;
        }
        else {
            return 0;
        }

    }
    public static int isOddGreater(int [] value){
        int len = value.length;
        int flag = 0;
        List<Integer>even = new ArrayList<Integer>();
        List<Integer>odd = new ArrayList<Integer>();

        int maxEven = inertial.getMaxEven(value);

        for(int i = 0; i < len; i++){
            if(value[i]%2 == 0){
                if(value[i] != maxEven){
                    even.add(value[i]);

                }
            }
            else {
                odd.add(value[i]);
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            for (int j = 0; j < even.size(); j++) {
                if(odd.get(i) < even.get(j)){
                    flag++;
                    break;
                }

            }

        }
        if( flag == 0){
            return 1;
        }
        else {
            return 0;
        }
    }
    public static int getMaxEven(int[] value){
        int len = value.length;
        int max = value[1];
        for(int i = 0; i < len; i++){
            if(value[i]%2 == 0){
                if(max < value[i]){
                    max = value[i];
                }
            }
        }
        return max;

    }
}
