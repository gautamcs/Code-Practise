package SortingAlgo;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {3, 6, 1, 2, 4, 5};
        System.out.println(" Original Array: " + Arrays.toString(arr));

        QuickSort sort = new QuickSort();
        int pivot = sort.pivot(arr, 0, arr.length - 1);
        System.out.println(" Pivot Index: " + pivot);
        System.out.println(" Pivot Element: " + arr[pivot]);

        sort.quickSort(arr, 0, arr.length - 1);
        System.out.println(" Sorted Array: " + Arrays.toString(arr));

    }

    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = pivot(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public int pivot(int[] arr, int low, int high) {
        int pi = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pi) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pi;
        arr[high] = temp;
        return i;
    }
}
