package Important_Questions_in_java.Assignment6;
/* Find second-largest element in an array */
public class q8 {
    protected static void findSecondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j > secondLargest) {
                secondLargest = j;
            }
        }

        System.out.println("Second largest element in the array: "+secondLargest);
    }

    public static void main(String[] args) {
        int[] arr = {78, 42, 69, 70, 50};
        findSecondLargest(arr);
    }
}