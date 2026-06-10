package binarysearch;

public class getLowerBound {
    public static int lowerBound(int [] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] >= target){
                ans = mid;
                e = mid -1; //move left
            }
            else{
                s = mid + 1; // move right
            }
        }
        return ans;
    }
    public static void main (String [] args){
        int nums [] = {10,20,30,30,30,30,40,50};
        int target = 35;
        System.out.print(lowerBound(nums, target));
    }
}
