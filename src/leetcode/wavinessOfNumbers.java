package leetcode;
//3751- You are given two integers num1 and num2 representing an inclusive range [num1, num2].
//The waviness of a number is defined as the total count of its peaks and valleys:
//A digit is a peak if it is strictly greater than both of its immediate neighbors.
//A digit is a valley if it is strictly less than both of its immediate neighbors.
//The first and last digits of a number cannot be peaks or valleys.
//Any number with fewer than 3 digits has a waviness of 0.
//Return the total sum of waviness for all numbers in the range [num1, num2].
public class wavinessOfNumbers {
    public static int totalWaviness(int num1, int num2) {
        int score = 0;

        for(int num = num1; num<= num2; num++){
            score += wavinessScore(num);
        }
        return score;
    }
    public static int wavinessScore(int num){
        String s = String.valueOf(num);

        int n = s.length();
        if(n<3){
            return 0;
        }
        int score = 0;
        for(int i=1; i< n-1; i++){
            if(s.charAt(i)>s.charAt(i-1) && s.charAt(i)>s.charAt(i+1)){
                score++; //peak
            }
            if(s.charAt(i)<s.charAt(i-1) && s.charAt(i)<s.charAt(i+1)){
                score++; //valley
            }
        }
        return score;
    }
    public static void main( String [] args){
        int num1 = 120;
        int num2 = 130;
        System.out.println(totalWaviness(num1,num2));
    }
}
