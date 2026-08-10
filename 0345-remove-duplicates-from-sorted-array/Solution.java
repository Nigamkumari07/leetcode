class Solution {
    public int removeDuplicates(int[] nums) {
      int o=0;int cm =1;
      int k =1;
      while(cm<nums.length){
        if(nums[cm-1]==nums[cm]){
            cm++;
        }
        else{
            nums[o+1]=nums[cm];
            cm++;o++;k++;
        }
      } 
      return k; 
    }
}