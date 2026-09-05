class Solution {
    public int reverse(int x) {
        long sum = 0;
        while(x!=0){
          int digit = x%10;
          sum = sum*10 + digit;
          x = x/10;
        }
        if(sum< -2147483648 || sum> 2147483647) return 0;
        return (int)sum;
    }
}