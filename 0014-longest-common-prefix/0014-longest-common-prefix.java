class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans = new StringBuilder();//store the prefix
       String first = strs[0]; // 1st elem/string of array
       String last = strs[strs.length-1];//last elem of array,
       //str.length-1=  index of last elem in array
       //compare the character of both string to get common prefix
       //loop shortest length string tak chalega kyuki uske baad common nhi milta h
       for(int i=0;i<Math.min(first.length(),last.length());i++){
             //stop if diff characters found in both string
             if(first.charAt(i)!=last.charAt(i)){
                return ans.toString();//COMMON PREFIX ko string bna kr return karo
             }
             ans.append(first.charAt(i));//matching char ko add karo
       }
        return ans.toString();
    }
}