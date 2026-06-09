package sorting;

public class mergeSort {
    public static void mergesort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e-s)/2;

        mergesort(arr, s, mid); //recursion
        mergesort(arr, mid+1, e); //recursion
        merge(arr, s , mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int n1 = mid - s +1; //length of the left array
        int n2 = e - mid; //length of right array
        int k = s;
        int [] L = new int[n1];
        int [] R = new int [n2];
        //filling left array
        for( int i=0; i<n1; i++){
            L[i] = arr[k];
            k++;
        }
        //filling right array
        for(int i=0; i<n2; i++){
            R[i] = arr[k];
            k++;
        }
        //merge them in arr
        int i=0 ,j=0;
        k = s;

        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k] = L[i];
                k++;
                i++;
            }
            else{
                arr[k] = R[j];
                k++;
                j++;
            }
        }
        //if right array is exhausted but left array still remains
        while(i<n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        //if left exhuasted but right remains
        while(j<n2){
            arr[k] = R[j];
            k++;
            j++;
        }
    }



    public static void main(String[] args) {

        int nums[] = {9, 4, 6, 1, 2, 0, 5};

        mergesort(nums, 0, nums.length - 1);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}