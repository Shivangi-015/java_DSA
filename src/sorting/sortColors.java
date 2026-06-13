package sorting;
//Input:
//nums = [2,0,2,1,1,0]
//Output:
//[0,0,1,1,2,2]
public class sortColors {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void colorsSort(int[] nums) {
        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] < nums[i]){
                    swap(nums, i , j);
                }
            }
        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,1,0,1,0,2,0};
        sortColors sort = new sortColors();
        sort.colorsSort(nums);
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}
//static method belongs to class
//non-static method belongs to object