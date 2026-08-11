class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        if(n>threshold) return -1;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,nums[i]);
        }
        int lo =1, hi = maxi;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(sumD(nums,mid)<= threshold){
                hi = mid-1;//min divisor chahiye to left m jayenge
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
        
    }
    public int sumD(int[] nums,int div){
        int n = nums.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum+= Math.ceil((double)(nums[i])/(double)(div));
        }
        return sum;
    }
}