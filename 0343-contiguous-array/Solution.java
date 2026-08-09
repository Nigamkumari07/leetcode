class Solution {
    public int findMaxLength(int[] nums) {
      int n = nums.length;
      HashMap<Integer,Integer> f = new HashMap<>();
      f.put(0,-1);
      int zero=0;
      int one =0;
      int ans =0;
      for(int i =0;i<n;i++){
        if(nums[i]==0){
            zero++;
        }
        else{
            one++;
        }
        int diff = zero-one;
        if(f.containsKey(diff)){
            int indx = f.get(diff);
        
            int len = i-indx;
            ans = Math.max(ans,len);
        }
        else{
            f.put(diff,i);
        }
      }
      return ans; 
    }
}