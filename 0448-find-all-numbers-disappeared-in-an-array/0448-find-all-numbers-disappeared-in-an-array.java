class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> numslist = new ArrayList();
        int i = 0;
        int n = 1;
        while(i<nums.length){
            set.add(nums[i]);
            i++;
        }
        while(n<=nums.length){
            if(!set.contains(n)){
                numslist.add(n);
            }
            n++;
        }
        return numslist;
    }
}