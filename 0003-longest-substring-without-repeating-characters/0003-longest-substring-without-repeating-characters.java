class Solution {
    public int lengthOfLongestSubstring(String s) {
       StringBuilder str = new StringBuilder();
       Set<Character> set = new HashSet();
        int max_len = 0;
       for(int i = 0; i < s.length(); i++){
            if(!set.add(s.charAt(i))){
                max_len = Math.max(str.length(),max_len);
                i = i - str.length();
                str.setLength(0);
                set.clear();
            }else{
                str.append(s.charAt(i));
            }

            
       }
       max_len = Math.max(str.length(),max_len);
       System.out.println(str);
       return max_len; 
    }
    
}