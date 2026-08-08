class Solution {
    public int pivotIndex(int[] nums) {
       //int []prefix=new int[nums.length];
         int l=0;
       int sum=0;
         for(int i =0;i<nums.length;i++){
          sum +=nums[i];
          }
          if(sum-nums[0]==0)return 0;
          for(int i=1;i<nums.length;i++){
          l=l+nums[i-1];
          int right = sum-nums[i]-l;
          if(l==right){
            return i;
          }
          }
    
       return -1;
    }
}