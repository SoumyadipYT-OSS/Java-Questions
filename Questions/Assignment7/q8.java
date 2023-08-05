package Important_Questions_in_java.Assignment7;
/* Find the sum of each row and each column of a matrix */
@SuppressWarnings("ALL")
public class q8 {
    protected static void eachRowSum(int[][] arr, int rowSize, int columnSize) {
        int sum = 0;
        System.out.println("Finding sum of each row:");
        for (int i=0; i<rowSize; i++) {     // 3
            for (int j=0; j<columnSize; j++) {  // 3
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of the row "+i+": "+sum); // sum of each row
            sum = 0; // resetting the value for calculating sum of next row
        }
    }

    protected static void eachColumnSum(int[][] arr, int rowSize, int columnSize) {
        int sum = 0;
        System.out.println("\nFinding sum of each column: ");
        for (int i=0; i<rowSize; i++) {
            for (int j=0; j<columnSize; j++) {
                sum = sum + arr[j][i];  // 3,  sum = 0 + arr[0][0] arr[1][0]
            }
            System.out.println("Sum of the column "+i+": "+sum); // sum of each column
            sum = 0;    // resetting the value for calculating sum of next column
        }
    }

    public static void main(String[] args) {
        int[][] givenArray = { {4,5,8}, {2,3,1}, {9,2,7} };
        eachRowSum(givenArray,givenArray.length, givenArray.length);
        eachColumnSum(givenArray, givenArray.length, givenArray.length);
    }
}