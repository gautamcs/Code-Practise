package SortingAlgo;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,1,9,0,8,6,7};
        System.out.println(" Original Array: "+ Arrays.toString(arr));
        //InsertionSort.insertionSortAlgo(arr);
        MergeSort.divide(arr, 0, arr.length-1);
        System.out.println(" Sorted Array: "+ Arrays.toString(arr));
    }

    public static void divide( int[] arr, int start, int end) {
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, mid, end);
    }

    public static void conquer(int[] arr, int start, int mid, int end) {
        int[] mergedArr = new int[end - start + 1];
        int x = start;
        int y = mid+1;
        int i = 0;

        while(x <= mid && y <= end) {
            if(arr[x] <= arr[y]) {
                mergedArr[i++] = arr[x++];
            } else {
                mergedArr[i++] = arr[y++];
            }
        }

        while (x <= mid) {
            mergedArr[i++] = arr[x++];
        }

        while (y <= end) {
            mergedArr[i++] = arr[y++];
        }

        for(int k = 0; k < mergedArr.length; k++) {
            arr[k+start] = mergedArr[k];
        }
    }
}
