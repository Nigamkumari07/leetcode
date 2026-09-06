class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int sum = 0;

        // First k cards from left
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }

        int max = sum;

        int r = n - 1;

        // Replace left cards one by one with right cards
        for (int i = k - 1; i >= 0; i--) {

            sum -= cardPoints[i];
            sum += cardPoints[r];
            r--;

            max = Math.max(max, sum);
        }

        return max;
    }
}