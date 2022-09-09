public class matches {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, -5, -5, 2, 3, 8};
        int[] P = {3, -2, 3};

        int result = isMatches(A, P);
        System.out.println("The result is " + result);

    }
    public static int isMatches(int []a, int []p){
            int result = 1;
            int start_Index = 0;
            int end_Index = 0;
        for(int j = 0; j < p.length; j++){
            int count = p[j];

                if(count < 0){
                    count = Math.abs(count);
                    end_Index = start_Index + count;
                    for (int indexA = 0; indexA < end_Index; indexA++){
                        if(a[indexA] > 0){
                            result = 0;
                            break;

                }

                }

            } else if (count > 0) {
                    end_Index = start_Index + count;
                    for(int indexA = 0; indexA < end_Index; indexA++){
                        if(a[indexA] < 0){
                            result = 0;
                            break;
                        }
                    }
                    
                }
                else {
                    result = 0;
                    break;
                }
            if( result == 0){
                break;
            }
            start_Index += count;
        }
      return result;
    }

}
