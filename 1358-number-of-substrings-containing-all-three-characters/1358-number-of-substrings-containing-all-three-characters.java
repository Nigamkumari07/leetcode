class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int[] lastseen = {-1,-1,-1};// last index of a,b,c
        int cnt = 0;
       for(int i = 0;i<n;i++){
        lastseen[s.charAt(i)-'a'] = i;//currant char ki index liko->lastseen index
        // each characters ka update karo
        //its mean teeno characters mil chuke h
        if(lastseen[0]!= -1 && lastseen[1]!= -1 && lastseen[2]!= -1){
            cnt += 1 + Math.min(lastseen[0],Math.min(lastseen[1],lastseen[2]));
     //teeno characters ka sabse chota index batata h-> mtlb y describe krta
     // hai ki substrings kaha se start hogi    

       }
        }
        return cnt;
    }
}