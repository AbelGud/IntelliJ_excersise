public class porcupine {
    public static void main (String [] args){
        int num = 9;
        System.out.println(" The next Porcupine Number is " + findNextPorcupineNumber(num));

    }
    public  static int findNextPorcupineNumber(int n){
        if(n%2 == 0){
            System.out.println("The Number is not prime and the next value is not porcupine Number!");

        } else if ( n < 0) {
            System.out.println("The number is negative is not porcupine Number!: ");

        }
        else {
            if(n%2 != 0){
                if(n%10 == 9){
                    System.out.println("The given value is porcupine Number " + n);
                    System.out.println("The next value is " + (n+1));
                }
            }
        }
        return nextPorcupineNumber(n);

    }
    public static int nextPorcupineNumber(int n){
        int nextValue = n + 1;
       // boolean isnextValue = false;


        while(nextValue > n){

            if((nextValue %2 != 0) && (nextValue % 10 == 9)){
                // isnextValue = true;
                return nextValue;
                //break;
            }else {
                nextValue ++;
                //isnextValue = false;
            }
        }
       return nextValue;


    }
}
