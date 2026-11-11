class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxend = nums[0];
        int minend=nums[0];
        int res = Math.abs(nums[0]);
        for(int i =1;i<nums.length;i++){
            maxend= Math.max(maxend+nums[i],nums[i]);
           minend = Math.min(minend+nums[i],nums[i]);
           res = Math.max(res,Math.max(maxend,Math.abs(minend)));
        }
         return res;
    }
}