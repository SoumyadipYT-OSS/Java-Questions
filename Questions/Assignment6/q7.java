package Important_Questions_in_java.Assignment6;
/* Find sum of elements in an array */
public class q7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum of all elements in the array.");
    }
}