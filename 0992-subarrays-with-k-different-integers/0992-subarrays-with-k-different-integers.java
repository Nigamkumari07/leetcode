class Solution {
    int atmost(int[] a,int k){
        int lo=0,hi =0,cnt =0;
        HashMap<Integer,Integer> f = new HashMap<>();
        int n =a.length;
        while(hi<n){
            f.put(a[hi],f.getOrDefault(a[hi],0)+1);
            while(f.size()>k){
                f.put(a[lo],f.get(a[lo])-1);
                if(f.get(a[lo])==0){
                    f.remove(a[lo]);
                }
                lo++;
            }
            cnt +=hi-lo+1;
            hi++;
        }
        return cnt;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
       return atmost(nums,k)-atmost(nums,k-1);
    }
}