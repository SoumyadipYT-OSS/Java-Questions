package Important_Questions_in_java.Assignment3;

// Write a java program to check whether the two arrays are equal or not
public class q2 {
    protected static void checkEqualArrays(int[] a, int[] b) {
        boolean result = true;
        if (a.length != b.length)
            System.out.println("Not equal");

        if (a.length == b.length) {
            for (int i=0; i<a.length; i++) {
                if (a[i] != b[i])
                    result = false;
            }
        }

        if (result == false)
            System.out.println("Not equal arrays");

        if (result == true)
            System.out.println("Equal arrays");
    }


    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};
        checkEqualArrays(arr1,arr2);
    }
}