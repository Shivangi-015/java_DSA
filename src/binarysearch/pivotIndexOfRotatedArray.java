package binarysearch;

public class pivotIndexOfRotatedArray {
    public static int findPivotIndex(int [] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        if(nums[s] < nums[n-1]){
            //no effective rotation
            return -1;
        }

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] <= nums[n-1]){
                //means we are in l2 section and answer l1 me hai
                //move left
                e = mid - 1;
            }
            else{
                //if mid is already in l1 then store answer
                ans = mid;
                //move to right for further checking the soln
                s = mid + 1;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        int nums [] = {50,60,70,10,20,30,40};
        System.out.println(findPivotIndex(nums));
    }
}
