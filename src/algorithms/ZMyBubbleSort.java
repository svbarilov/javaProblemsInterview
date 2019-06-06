package algorithms;

public class ZMyBubbleSort {

    public int[] bubbleSort(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++ ) {
           for (int j = 0; j < arr.length - i - 1; j++) {
               if (arr[j] > arr[j + 1] ) {
                   swap(arr, j, j + 1);
               }
           }
        }
        System.out.println(arr);
        return arr;
    }

    public void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = {4, 26, 3, 0, 15, 7, 2, 1, 3, 9, 8, 2, 1, 11};
        ZMyBubbleSort selSort = new ZMyBubbleSort();
        selSort.bubbleSort(testArr);
    }
}
