class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int[] f = new int[84];
       for(int i = 0; i < stones.length(); i++){
        f[stones.charAt(i) - 'A'] += 1;
       }
       int sum = 0;
       for(int j = 0; j < jewels.length(); j++){
        sum += f[jewels.charAt(j) - 'A'];
       } 
       return sum;
    }
}