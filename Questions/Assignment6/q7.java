package Important_Questions_in_java.Assignment7;
/* Display upper triangular and lower triangular matrix*/
@SuppressWarnings("ALL")
public class q7 {
    private static void displayMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    protected static void lowerTriangularMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row != col) {
            System.out.println("It is not a square matrix");
        } else {
            for (int i=0; i<row; i++) {     // < 3
                for (int j=0; j<col; j++) {
                    if (i < j)
                        matrix[i][j] = 0;
                }
            }
        }
        System.out.println("Lower Triangular Matrix is given by: ");
        displayMatrix(matrix);
    }

    protected static void upperTriangularMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        if (row != col) {
            System.out.println("Matrix should be a square matrix");
            return;
        } else {
            for (int i=0; i<row; i++) {
                for (int j=0; j<col; j++) {
                    if (i > j) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        System.out.println("Upper Triangular Matrix is given by: ");
        displayMatrix(matrix);
    }

    // main method or drive code
    public static void main(String[] args) {
        int[][] givenMatrix = { {1,2,3,9}, {8,7,6,11}, {5,3,4,7}, {8,6,2,1} };
        System.out.println("Given Matrix");
        displayMatrix(givenMatrix);
//        upperTriangularMatrix(givenMatrix);   // remove the comment line to perform 'upper triangular matrix'
//        lowerTriangularMatrix(givenMatrix);   // remove the comment line to perform 'lower triangular matrix'
    }
}