public class isDivisible {
    public static void main(String[] args) {
        int[] array = {3, 9,30, 6, 36};
        int result = isDivisible3(array);
        System.out.println("The return value is: " + result);

    }

    public static int isDivisible3(int[] a) {
        int count = 0;
        int value1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 != 0) {
                count++;
            }

        }
        if (count == 0) {
            value1 = 1;
        } else {
            value1 = 0;
        }
        return value1;
    }
}
