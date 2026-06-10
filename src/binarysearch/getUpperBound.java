package binarysearch;

public class getUpperBound {
    public static int upperBound(int [] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid] <= target){
                s = mid + 1; //we move right cause we want a greater element
            }
            else{
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
    public static void main (String[] args){
        int nums[] = {10,20,30,30,45,50,60,70};
        int target = 55;
        System.out.print(upperBound(nums, target));
    }
}















