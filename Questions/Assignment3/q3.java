package Important_Questions_in_java.Assignment3;
/*
    Write a java program to find the matrix multiplication of two arrays
    and store it in another array.
 */
public class q3 {
    private static void displayArray(int[][] arr) {
        int n = arr.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    protected static void matrixMultiplication(int[][] a, int[][] b) {
        int n = a.length;
        int[][] c = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                for (int k=0; k<n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        displayArray(c);
    }

    // main method or drive code
    public static void main(String[] args) {
        int[][] a = {{1,2}, {3,4}};
        int[][] b = {{5,6}, {7,8}};
        matrixMultiplication(a,b);
    }
}