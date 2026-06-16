package binarysearch;

public class sqrtX {
    public static int squareRoot(int n){
        if(n == 0){
            return 0;
        }
        int root = -1;
        int s = 1;
        int e = n;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid == n/mid){
                return mid;
            }
            else if(mid > n/mid){
                e = mid - 1;
            }
            else{
                root = mid;
                s = mid + 1;
            }
        }
        return root;
    }
    public static void main (String[] args){
        int n = 64;
        System.out.println(squareRoot(n));
    }
}
