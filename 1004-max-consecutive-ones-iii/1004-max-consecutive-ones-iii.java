class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r = 0,maxlen = 0;
        int zeroes = 0;
        while(r < nums.length){
            if(nums[r]==0){//elem 0 aaya then inc no in zeroes 
                zeroes++;
            }
           
            if(zeroes>k){//then we have to dec the no of 0 in zeroes
         //maxlen update tab hoga jab zeroes<=k  hoga only r++ karo   
                if(nums[l]==0) zeroes--;
                l++;
            }
            if(zeroes <= k){
                int len = r-l+1;
                maxlen = Math.max(maxlen,len);
            }
            r++;
        }
        return maxlen;
    }
}