class Solution {
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
     int[] hash = new int[256];//hashtable to store the last occurence ofeach chara
     Arrays.fill(hash,-1);//indicate no occurence of any characters
     int l =0,r =0,maxlen = 0;
     while(r < n){//iterate string
    //if chara is already in hashtable->same chara string m mila jo hash m alreay h
     if(hash[s.charAt(r)] >= l){
     //then l ko duplicate k baad le jao in string->move l to the right of the last
     // occurence of that duplicate character
     l = Math.max(hash[s.charAt(r)]+1,l);
     }
     int len = r-l+1;//length of current substring having no repeating characters
     maxlen = Math.max(maxlen,len);
      //store ind of current chara so that when duplicate appears,l can move 
     //correctly.
     hash[s.charAt(r)] = r;
     r++;// move kro r ko aage
    }
     return maxlen;
    }
    
        
    
}