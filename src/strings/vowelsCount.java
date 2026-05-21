package strings;
//count the number of vowels in string
public class vowelsCount {
    public static void main(String [] args){
        String name = "Shivangi";
        int count = 0;

        for (int i=0; i< name.length(); i++){
            char c = name.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
                count++;
            }
        }
        System.out.println("Number of vowels are = "+count);
    }
}
