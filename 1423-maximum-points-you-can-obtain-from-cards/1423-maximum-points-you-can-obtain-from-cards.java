class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int lsum = 0, rsum = 0, maxsum = 0;
       int  n  = cardPoints.length;
       // find sum of 1st k cards from front
       for(int i = 0;i<k;i++){
        lsum = lsum+ cardPoints[i];
        maxsum = lsum;//store the maximum score
       }
       int rindx = n-1;
       //slide the window->remove card from the front & add from the back
       for(int i = k-1;i>=0;i--){
        // substract cards from the from front 
        lsum = lsum-cardPoints[i];
        //add points from the back
        rsum = rsum + cardPoints[rindx];
           rindx--;
           maxsum = Math.max(maxsum,lsum + rsum);
       }
      // maxsum= Math.max(maxsum,lsum,rsum);
       return maxsum;
        
    }
}