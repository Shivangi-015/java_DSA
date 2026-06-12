package recursion;

public class reverseArray {
    //swap function
    public static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //reversing an array using two variables
    public static void reverse1(int [] arr,int s, int e){
        if(s>=e){
            return;
        }
        swap(arr, s, e);
        reverse1(arr, s+1, e-1);
    }
    //reversing an array using one variable
    public static void reverse2(int[] arr, int i){
        int n = arr.length;
        if(i >= n/2){
            return;
        }
        swap(arr, i, n-i-1);
        reverse2(arr, i+1);
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5,6};
        reverse2(nums, 0);
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}
