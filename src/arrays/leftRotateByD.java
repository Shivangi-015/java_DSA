package arrays;
//left rotate the array till d part
//solution - reverse the 1st part till d then reverse the second part then reverse the complete array
public class leftRotateByD {
    static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int nums [] = {1,2,3,4,5,6,7};
        int d = 3;
        int s = 0;
        int l = nums.length;
        int e = nums.length - 1;
        reverse(nums, s , d-1);
        reverse(nums, d, e);
        reverse(nums,s,e);
        for(int i=0; i< nums.length; i++){
            System.out.print(nums[i]);
        }
    }
}
