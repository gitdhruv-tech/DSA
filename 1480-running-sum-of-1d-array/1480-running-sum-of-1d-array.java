class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            res[i] = sum + nums[i];
            sum += nums[i];
        }
        return res;
    }
}