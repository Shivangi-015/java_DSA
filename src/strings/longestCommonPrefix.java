package strings;
//Write a function to find the longest common prefix string amongst an array of strings.
//If there is no common prefix, return an empty string "".

public class longestCommonPrefix {
    public static String common(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
//stringbuilder - class, represents mutable sequence of characters
//allows to modify strings that is append, insert, delete or reverse
        for(int i =0; i<n;i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String s1 = "car";
        String s2 = "race";
        System.out.println(common(s1,s2));
    }
}
