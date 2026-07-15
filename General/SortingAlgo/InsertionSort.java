package SortingAlgo;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(" Insertion Sort ...");

        int[] arr = {3,2,5,4,1};

        System.out.println(" Original Array: "+ Arrays.toString(arr));
        InsertionSort.insertionSortAlgo(arr);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }

    public static void insertionSortAlgo(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int j = i-1;
            int key = arr[i];
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
}
