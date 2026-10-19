class Solution {
    public int countDigits(int num) {
        int ld=0;
        int cnt=0;int nums=num;
        while(num>0){
            ld=num%10;
            if(nums%ld==0){
                cnt++;
            }
            num=num/10;
        }
        return cnt;
    }
}