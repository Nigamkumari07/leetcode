class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> f = new HashMap<>();
        f.put(0,1);
        int n = nums.length;
        int cnt =0;
        int sum =0;
        for(int i =0;i<n;i++){
             sum +=nums[i];
           int rem = sum%k;
             if(rem<0){
                 rem = rem+k;
                }
              if(f.containsKey(rem)){
                  cnt = cnt+f.get(rem);
                }
              f.put(rem,f.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
    
}