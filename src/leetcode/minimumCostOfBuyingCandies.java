package leetcode;

import java.util.Arrays;

//A shop is selling candies at a discount. For every two candies sold, the shop gives a third candy for free.
//The customer can choose any candy to take away for free as long as the cost of the chosen candy is less than or equal to the minimum cost of the two candies bought.
//For example, if there are 4 candies with costs 1, 2, 3, and 4, and the customer buys candies with costs 2 and 3, they can take the candy with cost 1 for free, but not the candy with cost 4.
//Given a 0-indexed integer array cost, where cost[i] denotes the cost of the ith candy, return the minimum cost of buying all the candies.
public class minimumCostOfBuyingCandies {
    public static int minimumCandyCost(int[]cost){
        int total = 0;
        Arrays.sort(cost);
        if(cost.length <= 2){
            for(int x : cost){
                total += x;
            }
        }
        else{
            for(int x : cost){
                total += x;
            }
            for(int i = cost.length % 3; i<cost.length;i+=3){
                total -= cost[i];
            }
        }
        return total;
    }
    public static void main (String[] args){
        int cost [] = {6,5,7,9,2,2};
        System.out.println(minimumCandyCost(cost));
    }
}
