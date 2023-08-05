package Important_Questions_in_java.Assignment7;

public class q3 {
    protected static void calculateAverage(int[] array) {
        int sum=0;
        float average = 0.0f;
        for (int i=0; i< array.length; i++) {
            sum += array[i];
        }
        average = (float) (sum / array.length);
        System.out.println("The average of the given array: "+average);
    }

    public static void main(String[] args) {
        int[] givenArray = {2,8,5,1,6,7,9,3,4};
        calculateAverage(givenArray);
    }
}