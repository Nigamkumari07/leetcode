class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> r= new HashMap<>();
        HashMap<Character,Integer> m = new HashMap<>();
        //dono string k charcters ko map m daalo with their value//
        for(int i=0;i<ransomNote.length();i++){
            char ch = ransomNote.charAt(i);
            r.put(ch,r.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<magazine.length();i++){
            char ch = magazine.charAt(i);
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char ch : r.keySet()){
            int fr= r.get(ch);
        
           int fm = m.getOrDefault(ch,0);
            if(fm<fr){
            return false;
             }
        }
        return true;
    }
}