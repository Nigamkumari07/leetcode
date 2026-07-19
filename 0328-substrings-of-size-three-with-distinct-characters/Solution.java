class Solution {
    public int countGoodSubstrings(String s) {
        int k=3;int cnt=0;
        int n =s.length();
        int lo =0; int hi =k-1;
        while(hi<n){
            char a = s.charAt(lo);
            char b = s.charAt(lo+1);
            char c = s.charAt(lo+2);
        
          if(a!=b && b!=c && c!=a){
            cnt++;
            } 
            if(hi==n)break;
            lo++;hi++;
        }
        return cnt++;
    }
}