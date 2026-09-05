class Solution {
    public int myAtoi(String s) {
        long ans =0; int sign =1;int n = s.length();
       int i =0;
       //remove skip spaces
       while(i<n && s.charAt(i) == ' ')i++;
       //check sign
       if(i==n)return 0;//string is empty
       if(s.charAt(i) == '-'){
        sign = -1; i++;
       }
       else if(s.charAt(i) == '+'){
        i++;
       }
       //conert char into integer
    //loop tabtak run hogi jabtak digits milte rhegi jaise character mila it stop
       while(i<n && Character.isDigit(s.charAt(i))){
           ans = ans*10+(s.charAt(i)-'0');
           if(sign*ans>Integer.MAX_VALUE) return Integer.MAX_VALUE;
           if(sign*ans<Integer.MIN_VALUE) return Integer.MIN_VALUE;
           i++;
         }
        
        return (int)(sign*ans);
    }
}