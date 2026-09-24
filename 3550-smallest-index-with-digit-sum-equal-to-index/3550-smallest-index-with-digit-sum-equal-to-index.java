class Solution {
    public int smallestIndex(int[] nums) {
        int[] sums = new int[nums.length];

        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            int k = nums[i];
            if(k<10){
                sums[i] = k;
            }else{
                while(k>0){
                    sum += k%10;
                    k = k / 10;
                }
                sums[i] = sum;
            }

        }
        for(int j = 0;j<sums.length;j++){
            System.out.println(sums[j]);
            if(sums[j] == j){
                
                return j;
            }
        }

        return -1;
    }
}