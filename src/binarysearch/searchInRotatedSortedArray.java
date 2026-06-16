package binarysearch;

public class searchInRotatedSortedArray {
    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n -1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid]<= nums[n-1]){
                e = mid - 1; //move to left part
            }
            else{
                ans = mid;
                s = mid+1;
            }
        }
        return ans;
    }
    public static int binarySearch(int [] nums,int s, int e, int target){
        int n = nums.length;
        while(s<=e){
            int mid = s + (e-s)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(target >nums[mid]) {
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
    public static int search(int[] nums, int target) {
        int pivotIndex = pivotIndex(nums);
        //if pivotindex is -1 then array is already sorted
        if(pivotIndex == -1) {
            int ans = binarySearch(nums, 0 , nums.length-1, target);
            return ans;
        }
        else{
            //array is not sorted or array is rotated sorted
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target >= nums[startArray1] && target <= nums[endArray1]){
                int ans = binarySearch(nums, startArray1, endArray1, target);
                return ans;
            }
            int startArray2 = pivotIndex + 1;
            int endArray2 = nums.length - 1;
            if(target >= nums[startArray2] && target <= nums[endArray2]){
                int ans = binarySearch(nums, startArray2, endArray2, target);
                return ans;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int nums [] = {50,60,70,10,20,30,40};
        int target = 30;
        System.out.println(search(nums, target));
    }
}
