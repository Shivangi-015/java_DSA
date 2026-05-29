package hashing;

import java.util.HashMap;

public class frequencyOfElements {
    public static void main(String[]args){
        int nums[] = {1,2,3,3,3,4,5,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for(Integer key : map.keySet()){

            System.out.println("frequency of element "
                    + key
                    + " is "
                    + map.get(key));
        }
    }
}
