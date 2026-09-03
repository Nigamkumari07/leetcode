class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0; int maxfreq = 0; int maxlen = 0;
        //freq array banao for A-Z
        int[] freq = new int[26];
        while(r< s.length()){
            //current character ka freq badao jaise jasie iterate kr rhe string ko
            freq[s.charAt(r)-'A']++;
         //window k andar sabse jada bar aane wala charac or maxfeq batao in window
          maxfreq = Math.max(maxfreq,freq[s.charAt(r)-'A']);
          //no of character to be convert or no of conversion character
          //int conversion = (r - l + 1) - maxfreq;//->no of characters to be replace
          //window substring invalid h
          while((r-l+1)-maxfreq > k){
                // then move left pointer
                //jo character window se bahar ja rhe h uska count kam karo
             freq[s.charAt(l)-'A']--;
               l++;   
            }
            //maxlength nikalo substring ka 
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}