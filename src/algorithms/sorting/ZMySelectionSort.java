package algorithms.sorting;

public class ZMySelectionSort {


    public void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
           int  minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                   minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
        System.out.println(arr);
    }

    public void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }



    public static void main(String[] args) {
        int[] testArr = {4, 26, 3, 0, 15, 7, 2, 1, 3, 9, 8, 2, 1, 11};
        ZMySelectionSort selSort = new ZMySelectionSort();
        selSort.selectionSort(testArr);
    }
}
