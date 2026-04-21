class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
      int n = nums.length;int res=0;
       int maxdiff=Integer.MAX_VALUE;
      for(int i =0;i<n;i++){
        
        int l =i+1;int r=n-1;
       
        while(l<r){
            int sum=nums[i]+nums[l]+nums[r];
            if(sum==target)return sum;
             int diff=Math.abs(sum-target);
               if(maxdiff>diff){
               maxdiff=diff;
               res=sum;}
           
            if(sum<target){
               l++;
            }else{
             r--;
            }
        }

      } 
      return res;

    }
}