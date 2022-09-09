import java.util.Arrays;

public class partialSum {
    public static void main(String[] args){
        int [] arry ={2,3,1,-6,8,-3,-1,2};
        int count = 0;
        int partalSum= 0;
        int pParialSum = 0;
        for(int i = 0; i < arry.length; i++){
            partalSum = partalSum + arry[i];
            if(partalSum > 5){
                count += 1;
                pParialSum = partalSum;
                partalSum = 0;
            } else if ((pParialSum + partalSum)>count) {
                
            }

        }
        System.out.println(Arrays.toString(arry));
        System.out.println("the total partial sum is: " + partalSum);
        System.out.println("The up count value " + count);

    }
}
