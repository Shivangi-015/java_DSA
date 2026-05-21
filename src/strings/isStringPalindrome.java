package strings;

public class isStringPalindrome {
    public static void main(String[] args){
        String name = "abba";
        String reverse = "";
        int n = name.length();
        for (int i = n-1; i>=0; i--){
            char ch = name.charAt(i);
            reverse = reverse + ch;
        }
        if (name.equals(reverse)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
