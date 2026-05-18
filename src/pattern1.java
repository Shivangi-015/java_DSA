//for pattern problem - use nested loop, outer loop for rows, inner loop for column, connect the value of rows with columns

public class pattern1 {
    public static void main (String []args){
        for (int i=0; i<=4; i++){
            for (int j=0; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
