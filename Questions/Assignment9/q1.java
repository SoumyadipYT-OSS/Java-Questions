package Important_Questions_in_java.Assignment9;
/* Find the GCD of the array elements */
@SuppressWarnings("ALL")
public class q1 {
    protected static int GCD(int a, int b) {
        if (a==0)
            return b;
        return GCD(b%a, a);
    }
    protected static int findGCD(int[] arr, int n) {
        int result = arr[0];
        for (int item : arr) {
            result = GCD(result, item);
            if (result == 1)
                return 1;
        }
        return result;
    }

    // main method or drive code
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        int n = arr.length;
        System.out.println(findGCD(arr, n));
    }
}