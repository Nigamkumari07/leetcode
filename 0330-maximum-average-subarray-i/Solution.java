class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int lo=0; int hi = k-1; int sum=0;int n = nums.length;double avg =0;
        for(int i=lo;i<k;i++){
            sum=sum+nums[i];
             avg = (double)sum/k;
        }
          double res =avg;
        while(hi<n){
          res = Math.max(res,avg);
          sum = sum-nums[lo];
          lo++;hi++;
          if(hi==n){
            break;
          }
          sum= sum+nums[hi];
          avg = (double)sum/k;
        }
        return res;
    }
}