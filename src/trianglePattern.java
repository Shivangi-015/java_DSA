//[space,star,space]
//[n-i+1, 2i+1, n-i+1], there will be 3 different inner loop

public class trianglePattern {
    public static void main(String []args){
        int n =5;
        for(int i=0; i<n; i++){
            for(int j = 0;j<n-i+1;j++ ){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i+1; j++){
                System.out.print("*");
            }
            for(int j = 0;j<n-i+1;j++ ){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
