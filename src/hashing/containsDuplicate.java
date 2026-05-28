package hashing;
import java.util.HashSet;
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
public class containsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 4, 5};
        HashSet<Integer> set = new HashSet<>(); //cause hashset includes unique elements onlyy
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        if (n == set.size()) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
