class Solution {
    public int pivotInteger(int n) {
      int totalsum = n*(n+1)/2;
      int left =0;
      for(int x=1;x<=n;x++){
        left +=x;
        int right = totalsum-left+x;
        if(left==right){
            return x;
        }
      }
      return -1;  
    }
}