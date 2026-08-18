class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lo=0; int hi=n-1;
        int res1=-1;
        int res2=-1;
        //1st elem's position
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]>target){
                hi=mid-1;
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{//move to left
            res1=mid;
               hi=mid-1;
            }
        }
    
        //last position of elem
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums[mid]>target){
                hi=mid-1;
            }
            else if(nums[mid]<target){
                lo=mid+1;
            }
            else{//move to right
            res2=mid;
            lo=mid+1;
            }
        }
        return new int[]{res1,res2};
    }
}