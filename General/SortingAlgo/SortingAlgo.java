package SortingAlgo;

public class SortingAlgo {

    // Bubble Sort
    // By default not adaptive in nature
    // Stable
    // Best suitable for
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            boolean flag = false; // To make it as Adaptive in nature
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) {
                return;
            }
        }
    }
    // Insertion Sort
    // Adaptive & Stable in nature
    // More suitable for LinkedList as Compared to Array
    public void insertionSortAlgo(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < n; i++) {
            int j = i -1;
            int key = arr[i];

            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    // Selection Sort
    // No Adaptive & Stable
    public void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
