import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class newInertial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the input array: ");
        int size = sc.nextInt();
        int[] value = new int[size];
        System.out.println("Enter the value: ");
        for(int i = 0; i < size; i++){
            value[i] = sc.nextInt();
        }
        if(size <= 1){
            System.out.println("The array is not inertial. ");

        }
        else {
            int test = newInertial.isInertial(value);
            if(test ==1){
                System.out.println("The array is inertial. ");

            } else {
                System.out.println("The array is not inertial. ");
            }
        }
        sc.close();
    }
    public static int isInertial(int [] value){
        int testEvenMax = 0;
        int testOddGreater = 0;

        int testOddValue = newInertial.isOddValue(value);
        if(testOddValue == 1){
            testEvenMax = newInertial.isEvenMax(value);
        }
        else {
            return 0;
        }
        if(testOddValue == 1 && testEvenMax == 1){
            testOddGreater = newInertial.isOddGreater(value);

        }else {
            return  0;
        }
        if(testOddValue == 0 || testEvenMax == 0 || testOddGreater == 0){
            return 0;
        } else {
            return 1;
        }

    }
    public  static int isOddGreater(int [] value){
        int len = value.length;
        int flag = 0;
        List<Integer> even = new ArrayList<Integer>();
        List<Integer> odd = new ArrayList<Integer>();
        int maxEven = newInertial.getMaxEven(value);
        for(int i = 0; i < len; i++){
            if(value [i]%2 == 0){
                if(value[i] != maxEven){
                    even.add(value[i]);
                }
            }


            else {
                odd.add(value[i]);
            }
        }
        for (int i = 0; i < odd.size(); i++) {
            for (int k = 0; k < even.size(); k++) {
                if (odd.get(i) < even.get(k)) {
                    flag++;
                    break;
                }
            }
        }
        if (flag == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int getMaxEven(int[] value) {
        // TODO Auto-generated method stub
        int len = value.length;
        int max = value[1];
        for (int i = 0; i < len; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        return max;
    }

    private static int isEvenMax(int[] value) {
        // TODO Auto-generated method stub
        int len = value.length;
        int max = value[1];
        for (int i = 0; i < len; i++) {
            if (value[i] > max) {
                max = value[i];
            }
        }
        if (max % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int isOddValue(int[] value) {
        // TODO Auto-generated method stub
        int len = value.length;
        int flag = 0;
        for (int i = 0; i < len; i++) {
            if (value[i] % 2 != 0) {
                flag++;
                break;
            }
        }
        if (flag != 0) {
            return 1;
        } else {
            return 0;
        }




        }

    }

