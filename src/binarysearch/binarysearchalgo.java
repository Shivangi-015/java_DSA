package binarysearch;

public class binarysearchalgo {
    public static int binarySearch(int[] nums, int target){
        int n = nums.length;
        int start =0;
        int end = n-1;
        int mid = start + (end - start)/2;
        while(start<= end){
            if(nums[mid]< target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
            else{
                return mid;
            }
            mid = start + (end - start)/2;  //since the values of start and end are updated therefore we have to update the value of mid also
        }
        return -1;
    }
    public static void main(String [] args){
        int nums[] = {10,20,30,40,50,60};
        int target = 50;
        System.out.print(binarySearch(nums, target));
    }
}
