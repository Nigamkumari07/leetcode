class Solution {
    public boolean check(int[] nums) {
        int n= nums.length;
        int peak=0;
        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n]){
                  peak++;
            }
        }
      return peak<=1;
 
    }
   
  // rotated sorted array m only 1 break hota h jisme wo 2 sorted part m split hojate h
  //Isliye rotated sorted array me maximum 1 break hota hai.
}