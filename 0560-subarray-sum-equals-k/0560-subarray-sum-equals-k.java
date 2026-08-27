class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> presumcnt = new HashMap<>();
        int presum = 0; int cnt = 0;
        presumcnt.put(0,1);//presum 0 has occur once
        for(int i =0;i<n;i++){
            presum += nums[i];
            int remove = presum - k;
//how many presum that can remove or the removal elements
            if(presumcnt.containsKey(remove)){
                cnt += presumcnt.get(remove);
            }
            //update the freq of
            presumcnt.put(presum,presumcnt.getOrDefault(presum,0)+1);
        }

        return cnt;
    }
}