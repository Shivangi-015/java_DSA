package arrays;

public class secondLargestNumber {
    public static void main (String[]args){
        int nums[] = {2,4,7,1,5,7};
        int largest = nums[0];
        int secondLargest = -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i]> largest){
                secondLargest = largest;
                largest = nums[i];
            }
            else if (nums[i] > secondLargest && nums[i] < largest){
                secondLargest = nums[i];
            }
        }
        System.out.println("second largest element is = " + secondLargest);
    }
}
