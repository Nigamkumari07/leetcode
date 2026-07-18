class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> f = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<nums1.length;i++){
           f.put(nums1[i],f.getOrDefault(nums1[i],0)+1);
        }
        for(int i=0;i<nums2.length;i++){
            if(f.containsKey(nums2[i]) && f.get(nums2[i])>0){
                ans.add(nums2[i]);
               f.put(nums2[i],f.get(nums2[i])-1);
            }
        }

        int a[]= new int[ans.size()];
        for(int i=0;i<a.length;i++){
            a[i]=ans.get(i);
        }
        return a;
    }

}