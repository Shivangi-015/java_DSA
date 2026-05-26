package strings;

import java.util.HashMap;

public class validAnagram {
    public static boolean isAnagram(String s , String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            //getorDefault(a,0) - if a exists it returns its value else it returns 0
            //put inserts new key value pair or updates the existing one
            //get helps in getting its old frequency
            if (map1.containsKey(ch1)) {
                map1.put(ch1, map1.get(ch1) + 1);
            } else {
                map1.put(ch1, 1);
            }
            if (map2.containsKey(ch2)) {
                map2.put(ch2, map2.get(ch2) + 1);
            } else {
                map2.put(ch2, 1);
            }
        }
        return map1.equals(map2); //checks if both the maps are equal or not
    }
        public static void main (String [] args){
            String s = "anagram";
            String t = "anaaagm";
            System.out.println(isAnagram(s, t));
        }
}
