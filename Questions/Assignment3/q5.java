package Important_Questions_in_java.Assignment3;

public class q5 {
    protected static void findMaximumMinimum(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i=1; i<arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("Largest: "+max);
        System.out.println("Smallest: "+min);
    }

    // main method or drive code
    public static void main(String[] args) {
        int[] myArr = {15,81,49,33,29,92,58,17,64,13};
        findMaximumMinimum(myArr);
    }
}