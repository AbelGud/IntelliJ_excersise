public class guthrieSequence {
    public static void main(String[] args){
        int [] array = {8,17,4,2,1};
        System.out.println("the result " + isGuthricSequence(array));


    }
    public static int isGuthricSequence(int[] a) {
        int nextSequence = a[0];
        int isGuthric = 0;
        if (a[a.length - 1] == 1) {
            for (int i = 0; i < a.length; i++) {
                if(nextSequence == a[i]){
                    isGuthric = 1;
                    if(a[i] % 2 == 0){
                        nextSequence = a[i]/2;
                    }else {
                        nextSequence = a[i] * 3 + 1;
                    }
                }
                else {
                    isGuthric = 0;
                    break;
                }

            }
        }
        else {
            isGuthric = 0;

        }
        return isGuthric;
    }


}
