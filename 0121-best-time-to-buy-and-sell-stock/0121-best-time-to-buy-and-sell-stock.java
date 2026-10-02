class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int max = 0;
        int temp;

        while(r < prices.length){
          if(prices[l]>prices[r]){
            l = r;
          }
          temp = prices[r] - prices[l];
          if(max < temp){
            max = temp;
          } 
          r++; 
        }
        
        return max;
    }
}