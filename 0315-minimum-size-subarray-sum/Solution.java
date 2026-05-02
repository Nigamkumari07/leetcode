class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;int res =Integer.MAX_VALUE;
        int lo=0; int hi = 0; int sum =0;
        while(hi<n){
            sum = sum + nums[hi];// amazon hire kr rhe h 
    //jabtak sum/kaam ban rha h tabtak fire krte jao(jabtak sum>=tar h tabtak fire krte jao)
          
            while(sum>=target){
              int len = hi-lo+1;
              res = Math.min(res,len);
              sum = sum-nums[lo];
              lo++;//fire krte jao
            }
            hi++;//jab sab fire ho jaye koi nhi bache then again hire kro aage wale ko
        }
        return res== Integer.MAX_VALUE?0:res;
    }
}