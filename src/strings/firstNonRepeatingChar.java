package strings;

import java.util.HashMap;

//input = leetcode then output = 0
//we have to return the index of the first non-repeating character
public class firstNonRepeatingChar {
    public static int firstNonRepeatingchar(String s){
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i =0; i<s.length(); i++){ //storing all the keys and their frequencies in hashmap
            char ch1 = s.charAt(i);

            if(map1.containsKey(ch1)){
                map1.put(ch1, map1.get(ch1) + 1);
            }
            else{
                map1.put(ch1, 1);
            }
        }
        for(int i =0; i<s.length(); i++){ //traversing the string in hashmap to check char frequency and return first with frequency equal to 1
            char ch1 = s.charAt(i);
            if(map1.get(ch1) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        String s = "loveleetcode";
        System.out.println(firstNonRepeatingchar(s));
    }
}
