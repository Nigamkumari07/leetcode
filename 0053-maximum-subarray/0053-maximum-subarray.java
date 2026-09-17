class Solution {
    public int maxSubArray(int[] nums) {
        long sum = 0; int n = nums.length;
        long maxi = Long.MIN_VALUE;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
       // if(maxi < 0){
       // maxi = 0;
        //}
        return (int)maxi;
        
    }
}