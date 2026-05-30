//find the length of the longest subarray with sum <=K
public class longestSubarray {
    public static void main (String []args){
        int nums [] = {2,5,1,10,10};
        int k = 14;
        int l = 0, r=0;
        int sum =0;
        int maxlen = 0;
        while(r< nums.length){
            sum = sum + nums[r];
            while(sum>k){
                sum = sum - nums[l];
                l++;
            }
            if(sum<=k){
                maxlen = Math.max(maxlen , r-l+1);
                r++;
            }
        }
        System.out.println(maxlen);
    }
}
