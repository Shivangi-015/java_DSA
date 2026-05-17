import java.util.Scanner;

public class armstrongNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number = ");
        int n = sc.nextInt();
        int dup = n;
        double sum =0;
        int N =  String.valueOf(n).length();
        while (n>0){
            int lastdigit = n % 10;
            sum = sum + Math.pow(lastdigit, N );
            n = n/10;
        }
        if (dup == sum){
            System.out.println("It is a armstrong number!!");
        }
        else{
            System.out.println("It is not a armstrong number");
        }
    }
}
