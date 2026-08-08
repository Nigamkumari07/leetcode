class Solution {
    public int largestAltitude(int[] gain) {
        int res=0;
        int alt=0;//initially aititude 0 hota h 
        for(int i =0;i<gain.length;i++){
            alt += gain[i];
            res = Math.max(res,alt);
            
        }
        return res;
    }
}
//gain[i]=array altitude differences deta hai