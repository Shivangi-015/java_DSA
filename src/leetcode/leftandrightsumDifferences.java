package leetcode;
//2574 You are given a 0-indexed integer array nums of size n.
//Define two arrays leftSum and rightSum where:
//leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
//rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
//Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.
public class leftandrightsumDifferences {
    public int[] leftRightDifferences(int [] nums){
        int n = nums.length;
        int [] answer = new int[n];
        for(int i=0; i<n; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j=0; j<i; j++){
                leftSum += nums[j];
            }
            for(int j = i+1; j<n; j++){
                rightSum += nums[j];
            }
            answer[i] = Math.abs(leftSum - rightSum);
        }
        return answer;
    }
    public static void main(String[] args){
        int nums[] = {10,4,8,3};
        leftandrightsumDifferences obj = new leftandrightsumDifferences();

        int[] result = obj.leftRightDifferences(nums);
        for(int i: result){
            System.out.print(i+" ");
        }
    }
}
