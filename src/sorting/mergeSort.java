package sorting;

public class mergeSort {

    public static void mergeSort(int[] arr, int start, int end) {

        if(start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while(i <= mid && j <= end) {

            if(arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        while(j <= end) {
            temp[k++] = arr[j++];
        }

        for(int p = 0; p < temp.length; p++) {
            arr[start + p] = temp[p];
        }
    }

    public static void main(String[] args) {

        int nums[] = {9, 4, 6, 1, 2, 0, 5};

        mergeSort(nums, 0, nums.length - 1);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}