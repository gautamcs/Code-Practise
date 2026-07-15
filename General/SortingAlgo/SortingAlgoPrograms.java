package SortingAlgo;

import java.util.Arrays;

public class SortingAlgoPrograms {
    public static void main(String[] args) {

        SortingAlgo sortingAlgo = new SortingAlgo();
        int[] arr = {2,3,5,4,1,9,0,8,6,7};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        //sortingAlgo.selectionSort(arr); // Selection Sort
        //sortingAlgo.bubbleSort(arr); // Bubble Sort
        sortingAlgo.insertionSortAlgo(arr); // Insertion sort
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }
}
