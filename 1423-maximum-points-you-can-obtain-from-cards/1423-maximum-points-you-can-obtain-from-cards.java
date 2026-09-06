class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int sum = 0;

        // Initially k cards from LEFT
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        int hi = k - 1;
        int r = n - 1;

        // One by one replace left card with right card
        while (hi >= 0) {

            sum -= cardPoints[hi];
            hi--;

            sum += cardPoints[r];
            r--;

            max = Math.max(max, sum);
        }

        return max;
    }
}