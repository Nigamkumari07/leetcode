class Solution {
    public int maximumSum(int[] arr) {
        int nodel=arr[0];
        int onedel = Integer.MIN_VALUE;
        int res =arr[0];
        for(int i =1;i<arr.length;i++){
            int v1 = nodel;
            int v2 = onedel;
            nodel=Math.max(v1+arr[i],arr[i]);
            if(v2==Integer.MIN_VALUE){
                onedel = arr[0];
            }else{
            onedel=Math.max(v2+arr[i],v1);
            }
            res = Math.max(res,Math.max(nodel,onedel));
        }
        return res;
    }
}