class Solution {
    public boolean[] transformStr(String s, String[] strs) {
      Object[] v = new Object[]{s,strs};
        int n = s.length();
        int one =0;
        int[]pref = new int[n+1];
        for(int i =0;i<n;i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            pref[i+1]=one;
        }
        int zero=n-one;
        boolean[] ans = new boolean[strs.length];
        for(int i =0;i<strs.length;i++){
            String t = strs[i];
            int c1=0;int c0 =0;
            for(int j=0;j<n;j++){
                char ch =t.charAt(j);
                if(ch=='1') c1++;
                else if(ch=='0') c0++;
            }

            int req0=zero-c0;
            int req1=one-c1;

            if(req0<0 || req1<0){
                ans[i]=false;
                continue;
            }
            boolean ok=true;
            int cur1=0;
            int qseen=0;
            for(int j=0;j<n;j++){
                char ch = t.charAt(j);
                if(ch=='1'){
                    cur1++;
                }else if(ch=='?'){
                    qseen++;
                    if(qseen>req0){
                        cur1++;
                    }
                }
                if(cur1>pref[j+1]){
                    ok=false;
                    break;
                }
            }
            ans[i]=ok;
        }
        return ans;
    }
}