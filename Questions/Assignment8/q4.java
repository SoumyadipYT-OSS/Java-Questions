package Important_Questions_in_java.Assignment8;

@SuppressWarnings("ALL")
class Matrix {
    private static int[][] matrix;
    private static int rows;
    private static int columns;
    public Matrix(int rows, int columns) {  // constructor
        this.rows = rows;
        this.columns = columns;
        matrix = new int[rows][columns];
    }


    protected static void displayMatrix(int[][] matrix) {
        for (int r=0; r<matrix.length; r++) {
            for (int c=0; c<matrix[0].length; c++) {
                System.out.print(matrix[r][c]+"\t");
            }
            System.out.println();
        }
    }

    // addition of matrices
    protected static void addition(int[][] first, int[][] second) {
        int row = first[0].length;
        int column = first[0].length;
        int[][] sum = new int[row][column];

        for (int r=0; r<row; r++) {
            for (int c=0; c<column; c++) {
                sum[r][c] = first[r][c]+second[r][c];
            }
        }

        System.out.println("\nSum of matrices:");
        displayMatrix(sum);
    }

    // multiplication of matrices
    protected static void multiplication(int[][] first, int[][] second) {
        int row = first.length;
        int column = first[0].length;
        int[][] mul = new int[row][column];

        for (int r=0; r<row; r++) {
            for (int c=0; c<column; c++) {
                mul[r][c] = first[r][c] * second[r][c];
            }
        }
        System.out.println("\nMultiplication of matrices: ");
        displayMatrix(mul);
    }

    protected int countRows() {
        return rows;
    }
    protected int countColumns() {
        return columns;
    }

    protected static void setElement_at_givenPosition(int r, int c, int val) {
        if (r>=0 && r<rows  &&  c>=0 && c<columns) {
            matrix[r][c] = val;
        } else {
            System.out.println("Invalid position!, this position does not exist in the given matrix.");
        }
    }
    protected static int getElement(int i, int j) {
        if (i>=0 && i<rows  &&  j>=0 && j<columns) {
            return matrix[i][j];
        } else {
            System.out.println("Invalid position");
            return 0;
        }
    }
}


@SuppressWarnings("ALL")
public class q4 {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2,2);
        Matrix m2 = new Matrix(3,3);

        m1.setElement_at_givenPosition(0,0,5);
        m1.setElement_at_givenPosition(0,1,6);
        m1.setElement_at_givenPosition(1,0,4);
        m1.setElement_at_givenPosition(1,1,2);

        m2.setElement_at_givenPosition(0,0,7);
        m2.setElement_at_givenPosition(0,1,2);
        m2.setElement_at_givenPosition(0,2,1);
        m2.setElement_at_givenPosition(1,0,9);
        m2.setElement_at_givenPosition(1,1,5);
        m2.setElement_at_givenPosition(1,2,13);
        m2.setElement_at_givenPosition(2,0,4);
        m2.setElement_at_givenPosition(2,1,3);
        m2.setElement_at_givenPosition(2,2,8);


    }
}