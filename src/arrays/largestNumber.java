package arrays;

public class largestNumber {
    public static void main(String[]args){
        int nums[] = {2,4,7,1,5,7};
        int largest = nums[0];
        for(int i =0; i< nums.length; i++){
            if(largest < nums[i]){
                largest = nums[i];
            }
        }
        System.out.println("Largest number in array nums is = " +largest);
    }
}
