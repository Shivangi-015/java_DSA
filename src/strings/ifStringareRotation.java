package strings;

public class ifStringareRotation {
    public static boolean areRotation(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        String temp = s + s;
        return temp.contains(t);
    }
    public static void main (String [] args){
        String s = "abcde";
        String t = "cdabe";
        System.out.println(areRotation(s,t));
    }
}
