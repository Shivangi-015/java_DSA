//to check if a number is a palindrome
import java.util.Scanner;

public class palindromeNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int revN = 0;
        int duplicate = n;
        while (n>0){
            int lastdigit = n % 10;
            n = n/10;
            revN = (revN * 10) + lastdigit;
        }
        if (duplicate == revN){
            System.out.println("yay!! it is a palindrome number");
        }
        else {
            System.out.println("It is not a palindrome number");
        }
    }
}
