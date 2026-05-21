package strings;
//not the best approach, not recommended
public class reverseAString {
    public static void main(String[] args){
        String name = "Shivangi";
        String reverse = "";
        int n = name.length();
        for (int i = n-1; i>=0; i--){
            char ch = name.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}
