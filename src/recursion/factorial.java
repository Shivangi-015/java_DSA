package recursion;
import java.util.Scanner;
public class factorial {
    public static int factorialN(int n){
        if(n<=1){
            return n;
        }
        return n * factorialN(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to calculate fatorial = ");
        int n = sc.nextInt();
        int factorial = factorialN(n);
        System.out.println("Factorial of "+ n+ " is " + factorial);
    }
}
