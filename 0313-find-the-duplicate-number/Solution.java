class Solution {
    public int findDuplicate(int[] nums) {
        int n  = nums.length;
        Arrays.sort(nums);
        int l =1;int res=0;
        while(l<n){
            if(nums[l]==nums[l-1]){
                 res = nums[l];
            }
            l++;
        }
        return res;
    }
}