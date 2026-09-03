class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
        
    }
    public int atmost(int[] nums, int k){
        int l = 0, r = 0, sum = 0, cnt = 0;
        if(k<0) return 0;
        while(r < nums.length){// traverse through array
            sum += nums[r]%2;//add the current number jise binary m convert krdiye
            //window shrink karo
            while(sum > k){
                sum = sum - nums[l]%2;//elem remove krenge to sum bhi dec hoga hi 
                l++;// left elem ko remove kr rhe so l ko +1 kr rhe h
            }
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
}