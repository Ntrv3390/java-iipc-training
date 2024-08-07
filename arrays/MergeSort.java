package arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int st, int en) {
        if(st < en) {
            int mid = st + (en - st) / 2;
            mergeSort(arr, st, mid);
            mergeSort(arr, mid+1, en);
            merge(arr, st, mid, en);
        }
    }
    private static void merge(int[] arr, int st, int mid, int en) {
        int i = st;
        int j = mid+1;
        int k = 0;
        int[] temp = new int[en - st + 1];
        while(i <= mid && j <= en) {
            if(arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }
        while(i <= mid) temp[k++] = arr[i++];
        while(j <= en) temp[k++] = arr[j++];
        for(i = st, k = 0; i <= en; i++, k++) arr[i] = temp[k];
    }
}
