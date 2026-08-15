class Solution {
    public int maxNumberOfBalloons(String text) {
      HashMap<Character,Integer> t = new HashMap<>();
      HashMap<Character,Integer> b = new HashMap<>();
      String balloon="balloon";
      int res=0;
      int ans = Integer.MAX_VALUE;
      for(int i=0;i<text.length();i++){
        char ch = text.charAt(i);
        t.put(ch,t.getOrDefault(ch,0)+1);
      }  
      for(int i=0;i<balloon.length();i++){
        char ch = balloon.charAt(i);
        b.put(ch,b.getOrDefault(ch,0)+1);
      }

      for(char ch:b.keySet()){
        int freq = b.get(ch);
      
      int ft=t.getOrDefault(ch,0);
      res=ft/freq;
      ans = Math.min(ans,res);
    }
    return ans;
    }
}