package leetcode;

import java.util.Arrays;

public class destroyingAsteroids {
    public static boolean destroyedAsteroids( int mass, int[] asteroids){
        Arrays.sort(asteroids);
        for(int m: asteroids){
            if(mass<m){
                return false;
            }
            else if(mass >= 1e5){
                return true; //early true
            }
            mass+= m;
        }
        return true;
    }
    public static void main(String[] args){
        int mass = 10;
        int asteroids[] = {3,9,19,5,21};
        System.out.println(destroyedAsteroids(mass , asteroids));
    }
}
