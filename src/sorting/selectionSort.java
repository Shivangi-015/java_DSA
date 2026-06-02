package sorting;

public class selectionSort {
    static void selectionsort(int [] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j = i+1; j<n; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main (String[] args){
        int nums [] = {9,4,6,1,2,0,5};
        selectionsort(nums);
        for(int i= 0; i< nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
