package sorting;
//select a pivot element usually the end one, partitione the array around it and then recursion
public class quickSort {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void quicksort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int Pi = partition(arr, low, high);

        quicksort(arr, low, Pi-1);
        quicksort(arr, Pi+1, high);
    }
    public static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int Pi = low;

        for(int i=low; i<high; i++){
            if(arr[i] <= pivot){
                swap(arr, i, Pi);
                Pi++;
            }
        }
        swap(arr, Pi, high);
        return Pi;
    }
    public static void main (String[] args){
        int nums[] = {5,2,9,4,3,6,1};
        quicksort(nums, 0, nums.length-1);
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
