package sorting;

public class bubbleSort {
    public static void bubblesort(int []arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){  //rounds
            for(int j=0; j<n-i-1; j++){  //loop for compairing neighbouring elements
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main (String[] args){
        int nums [] = {9,4,6,1,2,0,5};
        bubblesort(nums);
        for(int i= 0; i< nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
}
