class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n  = bloomDay.length;
        if(n<(long)m*k) return -1;
        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++){
          mini = Math.min(mini,bloomDay[i]);
          maxi = Math.max(maxi,bloomDay[i]);
        }
        int lo = mini,hi = maxi,ans = hi;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(possible(bloomDay,mid,m,k)== true){
                ans = mid;
                hi = mid-1;//mim value chahiye days ki
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
        
    }
    public static boolean possible(int[] bloomDay,int day,int m,int k){
        int cut = 0,noofB = 0;
        int n = bloomDay.length;
        for(int i = 0;i<n;i++){
            if(bloomDay[i]<=day){
                cut++;
            }
            else{
                noofB +=(cut/k);
                cut = 0;
            }
        }
        noofB += (cut/k);
        if(noofB>=m) return true;
        else return false;
    }
}