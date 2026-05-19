package arrays;
//to check if the array is sorted or not
public class isArraySorted {
    public static void main (String[] args){
        int nums[] = {2,4,5,7,1,7};
        for (int i =1; i<nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {

            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
