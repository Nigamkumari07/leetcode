import java.util.*;
class Solution {
    private long totalHr(int[] piles,int hourly) {
        long totalhrs = 0;
        for(int i = 0;i<piles.length;i++){
            totalhrs += (int)Math.ceil((double)piles[i]/hourly);
        }
        return totalhrs;
    }
   
    
    public int minEatingSpeed(int[] piles, int h) {
        int lo =1,hi = Arrays.stream(piles).max().getAsInt();
     
        int ans = hi;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
           long totalhrs = totalHr(piles,mid);
            if(totalhrs<= h){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
        
    }
}