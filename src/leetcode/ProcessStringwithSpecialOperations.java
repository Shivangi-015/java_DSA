package leetcode;

public class ProcessStringwithSpecialOperations {
    public static String reverseString(String name){
        String reverse = "";
        int n = name.length();
        for (int i = n-1; i>=0; i--){
            char ch = name.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }
    public static String processStr(String s) {
        int n = s.length();
        String result = "";
        for(int i=0; i<n; i++){
            if(s.charAt(i)>='a' && s.charAt(i) <= 'z'){
                result = result + s.charAt(i);
            }
            else if(s.charAt(i) == '*'){
                if(!result.isEmpty()){
                    result = result.substring(0, result.length() - 1);
                }
            }
            else if(s.charAt(i) == '#'){
                result = result + result;
            }
            else{
                result = reverseString(result);
            }
        }
        return result;
    }
    public static void main (String [] args){
        String s = "a*bb*#%";
        System.out.print(processStr(s));
    }
}
