import java.util.Scanner;

public class reverseNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse = ");
        int n = sc.nextInt();
        int revN = 0;

        while (n>0){
         int lastdigit = n % 10;
         n = n/10;

         revN = (revN * 10) + lastdigit;
        }
        System.out.println("Reverse of n is = "+ revN);
    }
}
