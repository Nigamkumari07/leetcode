class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1 =0, cnt2 =0;
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i = 0;i<n;i++){//find the candidate ele1 and ele2
            if(cnt1 ==0 && ele2 !=nums[i]){
                cnt1 = 1; ele1 = nums[i];
            }
            else if(cnt2 ==0 && ele1 !=nums[i]){
                cnt2 = 1;ele2 = nums[i];
            }
            else if(nums[i]== ele1){
                cnt1++;
            }
            else if(nums[i] == ele2){
                cnt2++;
            }
            else{
                cnt1--; cnt2--;
            }
        }
        //count the actual freq
       cnt1 = 0; cnt2 = 0; 
      for(int i=0;i<n;i++){
        if(nums[i]==ele1) cnt1++;
        if(nums[i]==ele2) cnt2++;
      }
      //check they occur>n/3
      int min = (n/3)+1;
      List<Integer> res = new ArrayList<>();
      if(cnt1 >= min) res.add(ele1);
      if(cnt2 >= min && ele1 !=ele2) res.add(ele2);
      return res;        
    }
  
}