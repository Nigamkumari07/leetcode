class Solution {
    void swap(int[] arr1,int i,int[] arr2,int j){
        int temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = n+m;
        int gap = (len/2) + (len%2);
        while(gap>0){
            int l = 0, r = gap;
            while(r<len){
                //nums1 and nums2 compare karo
                if(l<m && r>=m){
                   if(nums1[l] > nums2[r-m]){
                    swap(nums1, l,nums2,r-m);
                   }
                }
                //both in nums1 ko compare karo
                else if(l<m && r< m){
                    if(nums1[l]>nums1[r]){
                        swap(nums1,l,nums1,r);                    }
                }
                else if(l>=m && r>=m){//both in nums2 ,compare karo dono ko
                    if(l-m < n && r-m < n && nums2[l-m]>nums2[r-m]){
                        swap(nums2,l-m,nums2,r-m);
                    }
                }
                l++;r++;
            }
             gap = (gap<=1)? 0: (gap/2 + gap%2);
        }
        for(int i =0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
    }
}