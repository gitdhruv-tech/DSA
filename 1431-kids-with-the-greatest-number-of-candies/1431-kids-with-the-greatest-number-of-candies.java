class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      ArrayList<Boolean> res = new ArrayList<>();

        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            res.add(sum >= max);
        }

        return res;
    }
}