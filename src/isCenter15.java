public class isCenter15 {
    public static void main(String[]args){
        int[] array = {1,-1,15,1};
        int result = isCenter15(array);
        System.out.println("The array is " + result);
        
    }

    public static int isCenter15(int []a){
        int isCenter15 = 0;
        int lowerIndex = 0;
        int upperIndex = 0;
        int sum = 0;

            if(a.length%2 == 0){
                lowerIndex = (a.length/2) -1;
                upperIndex = a.length /2;
            }
            else {
                lowerIndex = (a.length-1) /2;
                upperIndex = lowerIndex;
            }
            while (lowerIndex >= 0 && upperIndex < a.length){
                sum = 0;
                for (int i = lowerIndex; i <= upperIndex; i++) {
                sum += a[i];
                }
                if(sum == 15){
                    isCenter15 = 1;
                    break;
                }
                lowerIndex --;
                upperIndex ++;

            }
            return isCenter15;




    }

}
