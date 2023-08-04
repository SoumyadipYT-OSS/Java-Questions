package Important_Questions_in_java.Assignment3;

import java.util.Arrays;

/*
    Write a java program to find all the elements occurring more than once
    in a given array and return it in ascending order.
*/
public class q4 {
    protected static int[] occurringElements(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == arr[i-1]){
                count++;
                while (i<arr.length && arr[i]==arr[i-1]) {
                    i++;
                }
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int i=1; i<arr.length; i++) {
            if (arr[i] == arr[i-1]) {
                result[index++] = arr[i];
                while (i<arr.length  &&  arr[i]==arr[i-1])
                    i++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int[] result = occurringElements(arr);
        System.out.println(Arrays.toString(result));
    }
}