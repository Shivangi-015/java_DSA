package leetcode;

import java.util.ArrayList;

//2161 You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
//Every element less than pivot appears before every element greater than pivot.
//Every element equal to pivot appears in between the elements less than and greater than pivot.
//The relative order of the elements less than pivot and the elements greater than pivot is maintained.
//More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
//Return nums after the rearrangement.
public class partioningArrayAccordingToPivot {
    public static int[] pivotArray(int[] nums, int pivot){
        ArrayList <Integer> smaller = new ArrayList<>();
        ArrayList <Integer> equal = new ArrayList<>();
        ArrayList <Integer> greater = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]<pivot){
                smaller.add(nums[i]);
            }
            else if(nums[i]>pivot){
                greater.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }
        }
        smaller.addAll(equal);
        smaller.addAll(greater);
        int [] answer = new int[smaller.size()];

        for(int i=0; i< smaller.size(); i++){
            answer[i] = smaller.get(i);
        }
        return answer;
    }
    public static void main(String[] args){
        int nums[] = {9, 12,5,10,14,3,10};
        int pivot = 10;
        int [] result = pivotArray(nums, pivot);
        for(int i : result){
            System.out.print(i+ " ");
        }
    }
}
