class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> f = new HashMap<>();
        int len =0;
        boolean odd = false;
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        for(char ch:f.keySet()){
            int val = f.get(ch);
            if(val%2==0){
             len +=val;
            }
            else if(val%2==1){
                len += val-1;
                odd=true;
            }
        }
        if(odd){
            len++;
        }
        return len;
    }
}