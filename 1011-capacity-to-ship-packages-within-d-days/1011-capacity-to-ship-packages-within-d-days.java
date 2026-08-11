class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int hi =0,lo = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            lo = Math.max(lo,weights[i]);
            hi+=weights[i];
        }
        while(lo<=hi){
            int mid =(lo+hi)/2;
            int noofdays = findDays(weights,mid);
            if(noofdays<=days){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
        
    }
    public int findDays(int[] weights,int cap){
        int n = weights.length;
        int days = 1,load=0;//on 1st day
        for(int i =0;i<n;i++){
            if(load+weights[i]>cap){
                days = days+1;//then move to next days
                load = weights[i];//next days m wgt de dete h
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
}