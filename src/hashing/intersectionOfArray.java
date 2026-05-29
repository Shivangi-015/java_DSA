package hashing;

import java.util.HashSet;

public class intersectionOfArray {
    public static void main(String [] args){
        int nums1[] = {1,2,2,3,1,4};
        int nums2[] = {1,2,4};
        HashSet<Integer> answer = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                answer.add(nums2[i]);
            }
        }
        System.out.println(answer);
    }
}
