package sorting;

public class insertionSort {
    static void insertionsort(int [] arr){
        int n = arr.length;
        for (int i=1; i<n; i++){
            int curr = i;
            int prev = i-1;
            int currValue = arr[curr];
            while(prev >= 0 && currValue < arr[prev]){
                arr[prev + 1] = arr[prev]; //shifting
                prev--;
            }
            arr[prev+1] = currValue; //placing value
        }
    }
    public static void main (String[] args){
        int nums [] = {9,4,6,1,2,0,5};
        insertionsort(nums);
        for(int i= 0; i< nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
