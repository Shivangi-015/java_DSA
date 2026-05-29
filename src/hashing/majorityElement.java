package hashing;

import java.util.HashMap;

//majority element is the one that appears more than n/2 times for array nums of size n
public class majorityElement {
    public static void main(String[] args){
        int nums [] = {1,2,3,3,3,3,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i =0;i<n;i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }

            if (map.get(nums[i]) > n / 2) {
                System.out.println("Majority element is = " + nums[i]);
            }
        }
    }
}
