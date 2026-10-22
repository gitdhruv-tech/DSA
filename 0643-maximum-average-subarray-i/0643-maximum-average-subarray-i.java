class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int n = k;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double maxavg = (double) sum / n;
        int j = 0;

        while (k <= nums.length) {
            double avg = (double) sum / n;
            maxavg = Math.max(maxavg, avg);
            if (k != nums.length) {
                sum = sum + nums[k] - nums[j];
                
            }
            j++;
            k++;

        }
        return maxavg;
    }
}