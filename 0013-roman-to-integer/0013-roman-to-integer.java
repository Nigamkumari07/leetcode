class Solution {
    public int romanToInt(String s) {
        int n = s.length(); int ans = 0;
        //map of roman char with its values
        Map<Character,Integer> roman = new HashMap<>();
        roman.put('I',1);
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);//roman.get('x') =10
     for(int i=0;i<n-1;i++){//last ind nhi lenge kyuki curr or next comparison kr
            //curr <next then substract smaller(curr) in ans
         if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
            ans -= roman.get(s.charAt(i));
         }
         else{//addd the curr value in ans
            ans += roman.get(s.charAt(i));
         }
        }
        return ans+roman.get(s.charAt(n-1));//last char k value ko add kiye
    }
}