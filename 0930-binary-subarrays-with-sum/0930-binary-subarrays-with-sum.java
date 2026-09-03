class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal) - atmost(nums,goal-1);
        
    }
    private int atmost(int[] nums,int goal){
        int l = 0, r = 0, sum = 0, cnt = 0;
        if(goal < 0) return 0;
        while(r < nums.length){// traverse the array with r pointer
            sum += nums[r];
            while(sum > goal){//window shrink karo by eliminating elem from left
                sum = sum - nums[l];//to sum bhi dec hoga shrinking se
                l++;//move l forward
            }
        //no of valid subarray = len of that subarray    
            cnt = cnt+(r-l+1);
            r++;
        }
        return cnt;
    }
}