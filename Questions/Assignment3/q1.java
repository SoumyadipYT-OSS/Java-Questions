package Important_Questions_in_java.Assignment3;
/*
    write a java program consider two arrays of size m and n respectively.
    Find the number of distinct elements present in the union of the array
*/
import java.util.HashSet;
import java.util.Set;
public class q1 {
    protected static void findDistinctElements(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int item1 : arr1)
            union.add(item1);
        for (int item2 : arr2)
            union.add(item2);
        System.out.println("The number of distinct elements in the union of the two array is: "+union.size());
    }

    // main method or drive code
    public static void main(String[] args) {
        int[] array1 = {5,6,7};
        int[] array2 = {6,7,8};
        findDistinctElements(array1,array2);    // distinct elements are 5,6,7,8
    }
}