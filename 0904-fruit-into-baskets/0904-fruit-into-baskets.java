class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;int lo =0;int res =0;
        Map<Integer,Integer> f = new HashMap<>();
        for(int hi =0;hi<n;hi++){
            //hasmap m elem ko daalo and uska freq likho jitni bar arha h //
           f.put(fruits[hi],f.getOrDefault(fruits[hi],0)+1); 
           //2 basket h -> 2 hi type of fruits hoga 
            while(f.size()>2){//tisra alag fruits aaya to phla type fruits k freq kam kro//
                f.put(fruits[lo],f.get(fruits[lo])-1);

                if(f.get(fruits[lo])==0){// if freq is 0 then remove that elem from hashmap//
                     f.remove(fruits[lo]);
                }
                 lo++;
            }
           
// jo hmhe actually chahiye only <=2 type of fruits //
             if(f.size()<=2){
                int len = hi-lo+1;//length of aaray bta deta h ki total kitne fruits h
                res = Math.max(res,len);
             }
        }
        return res;
    }
}