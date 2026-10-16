class Solution {
    public int[] getSneakyNumbers(int[] nums) {
      Set<Integer> set = new HashSet();
      int[] res = new int[2];
      int idx = 0;
      for(int i = 0; i < nums.length; i++){
        if(!set.add(nums[i])){
            res[idx] = nums[i];
            idx++;
        }
      }
      return res;
    }
}