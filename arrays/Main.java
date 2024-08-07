package arrays;

public class Main {
    private static void printArr(int[] arr) {
        for(int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 8, 3, 6, 2, 9, 0};
        int n = arr.length - 1;
        // printArr(arr);
        // MergeSort.mergeSort(arr, 0, n);
        // printArr(arr);
    }
}
