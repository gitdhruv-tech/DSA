class Solution {
    public int[] twoSum(int[] nums, int target) {
      int temp;
      for(int i = 0; i < nums.length; i++){
        temp = target - nums[i];
        for(int j = i + 1; j < nums.length; j++){
          if(nums[j] == temp){
            return new int[]{i, j};
          }
        }
      }
      return new int[]{-1, -1};  
    }
}