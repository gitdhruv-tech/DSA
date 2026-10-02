class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = 0;
        int r = 1;
        int temp = 0;
        while(r<nums.length){
            if(nums[l] != nums[r]){
                temp = nums[l+1];
                nums[l+1] = nums[r];
                nums[r] = temp;
                l++; 
            }
            r++;
        }
        return l+1;
    }
}