class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;int len=0;int cnt=0;int lo=0;int hi=0;int ans=0;
        while(hi<n){
            if(nums[hi]==0){
                cnt++;
            }
            if(cnt>k){
                if(nums[lo]==0){
                    cnt--;
                }
                lo++;
            }
            len=hi-lo+1;
            ans=Math.max(ans,len);
            hi++;
        }
        return ans;
    }
}