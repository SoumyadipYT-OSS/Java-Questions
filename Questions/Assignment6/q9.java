package Important_Questions_in_java.Assignment6;
/* check an array is a subset of another array or not */
public class q9 {
    protected static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
        int i=0;
        int j=0;
        for (i=0; i<n; i++) {
            for (j=0; j<m; j++) {
                if (arr2[i] == arr1[j])
                    break;
            }

            if (j == m)
                return false;
        }
        return true;
    }

    // main method or drive code
    public static void main(String[] args) {
        int[] arr1 = {11, 1, 13, 21, 3, 7};
        int[] arr2 = {11, 3, 7, 1};

        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n))
            System.out.println("Subset");
        else
            System.out.println("Not subset");
    }
}