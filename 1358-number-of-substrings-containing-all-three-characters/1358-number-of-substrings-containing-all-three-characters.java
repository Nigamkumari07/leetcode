class Solution {
    static long atmost(String s,int k){
        int lo=0;int hi=0;long ans =0;
        int n =s.length();
        HashMap<Character,Integer>f=new HashMap<>();
        while(hi<n){
            char ch =s.charAt(hi);
            f.put(ch,f.getOrDefault(ch,0)+1);
            while(f.size()>k){
                char left = s.charAt(lo);
                f.put(left,f.get(left)-1);
                if(f.get(left)==0){
                    f.remove(left);
                }
                lo++;
            }
            ans += hi-lo+1;
            hi++;
        }
        return ans;
    }
    public int numberOfSubstrings(String s) {
        int k=3;
	   int n = s.length();
	   long total=(long)n*(n+1)/2;
		return (int)(total-atmost(s,k-1));  
    }
    
}