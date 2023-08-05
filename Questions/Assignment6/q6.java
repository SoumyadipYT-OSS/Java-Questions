package Important_Questions_in_java.Assignment7;

import java.util.Arrays;

/* Find the third-largest element in an array */
public class q6 {
    protected static void findThirdLargestElement(int[] arr) {
        Arrays.sort(arr);
        int third_largestElement = arr[arr.length-3];
        System.out.println("Third largest element in the array: "+third_largestElement);
    }

    public static void main(String[] args) {
        int[] a = {5,3,8,7,6,2,9,1,10};
        System.out.println(Arrays.toString(a));
        findThirdLargestElement(a);
    }
}