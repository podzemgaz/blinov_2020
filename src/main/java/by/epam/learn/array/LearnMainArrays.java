package by.epam.learn.array;

import java.util.Arrays;

public class LearnMainArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 19, 3, 9, 15};
        int[] arr2 = {1, 9, 3, 11, 5};
        System.out.println(Arrays.equals(arr1, arr2)); // false
        System.out.println(Arrays.compare(arr1, arr2)); // arr1[3]<arr2[3]. Print: -1
        Arrays.sort(arr1);
        System.out.println("binary search: " + Arrays.binarySearch(arr1, 15)); // arr1[2] = 3
        System.out.println(Arrays.toString(arr1)); // after sorting [1, 3, 7, 8, 9]
    }
}
