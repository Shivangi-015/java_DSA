package recursion;
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

public class fibonnaci {
 public static int fibonnacinumber(int n){
     if(n<=1){
         return n;
     }
     return fibonnacinumber(n-1) + fibonnacinumber(n-2);
 }
 public static void main (String[] args){
     int n = 5;
     System.out.print(fibonnacinumber(7));
 }
}
