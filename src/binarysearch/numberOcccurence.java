package binarysearch;

public class numberOcccurence {
    public static int lowerBound(int [] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
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
    public static int upperBound(int [] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;  //initialized with n for the case if all elements are less then or equal to target
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
    public static int countFrequency(int [] arr, int target){
        int lowerIndex = lowerBound(arr,target);
        int upperIndex = upperBound(arr, target);
        int frequency = upperIndex - lowerIndex;
        return frequency;
    }
    public static void main(String [] args){
        int nums [] = {10,20,20,20,20,20,30,30};
        int target = 20;
        System.out.print(countFrequency(nums, target));
    }
}
