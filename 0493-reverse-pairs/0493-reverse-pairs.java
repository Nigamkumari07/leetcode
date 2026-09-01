class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergesort(nums,0,n-1);
    }
    int mergesort(int[] nums,int low,int high){
        if(low>=high) return 0;
        int mid =(low+high)/2;
        int cnt = 0;
        cnt += mergesort(nums,low,mid);//left half ka revcnt nikalo
        cnt += mergesort(nums,mid+1,high);//right half ka rev cnt karo
        cnt += countpairs(nums,low,mid,high);//left right cross ka rev cnt karo
        // dono sorted half ko merge karo
        merge(nums,low,mid,high);
        return cnt;
    }
    int countpairs(int[] nums,int low,int mid,int high){
          int cnt = 0; int right = mid+1;
          for(int i = low;i<=mid;i++){
            while(right<=high && (long)nums[i]> 2L*nums[right]){
                right++;
            }
            cnt = cnt+ (right-(mid+1));
          }
          return cnt;
    }
    void merge(int[] nums,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;int right = mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<=nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }//bache hue elem ko add karo temp m chahe wo left half se ho ya right
        while(left<=mid) temp.add(nums[left++]);
        while(right<=high) temp.add(nums[right++]);
       // original array m copy karo
       for(int i = low;i<= high;i++){
        nums[i] = temp.get(i-low);
       }
    }
}