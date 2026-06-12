package recursion;

public class sum {
    public static int sumOfFirstN(int n){
        if(n<=1){
            return n;
        }
        return n + sumOfFirstN(n-1);
    }
    public static void main(String[] args){
        int n = 10;
        System.out.println(sumOfFirstN(n));
    }
}
